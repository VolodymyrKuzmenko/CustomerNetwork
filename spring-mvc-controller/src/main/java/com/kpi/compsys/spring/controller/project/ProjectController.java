package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.model.Project;
import com.kpi.compsys.model.Status;
import com.kpi.compsys.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by Vova on 12/4/2015.
 */
@Controller
@RequestMapping
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/projects")
    public ModelAndView getUserProjects() {
        ModelAndView projectsModelView = new ModelAndView();
        projectsModelView.setViewName("projects");
        List<Project> projects = projectService.getAll();
        projectsModelView.addObject("projectsList", projects);

        return projectsModelView;
    }

    @RequestMapping(value = "/project")
    public ModelAndView getProjectById(@RequestParam("projectID") Integer projectID) {
        ModelAndView projectModelView = new ModelAndView();
        projectModelView.setViewName("project-view");
        Project project = projectService.getById(projectID);
        projectModelView.addObject("project", project);
        projectModelView.addObject("childProjectsList", projectService.getChildProjects(projectID));
        projectModelView.addObject("tasksList", project.getTasks());

        return projectModelView;
    }

    @RequestMapping(value = "/createproject", method = RequestMethod.POST)
    public String createProject(
            @RequestParam String projectName,
            @RequestParam Integer responsibleId,
            @RequestParam String projectDescription, @RequestParam(defaultValue = "0") Integer parrentProjectId

    ) {

        Project project = new Project();
        if (parrentProjectId != 0) {
            project.setParrentProject(projectService.getById(parrentProjectId));
        }
        project.setDateCreated(new Date(System.currentTimeMillis()));
        project.setDescriprion(projectDescription);
        project.setName(projectName);
        project.setDateCreated(new Date(System.currentTimeMillis()));
        project.setDateUpdated(project.getDateCreated());
        project.setResponsible(userService.getById(responsibleId));
        project.setStatus(Status.PROJECT_TODO);
        projectService.add(project);
        return "redirect:/projects";
    }

    @RequestMapping(value = "/createproject", method = RequestMethod.GET)
    public ModelAndView loadUsersForCreateProject(@RequestParam("projectId") Integer projectId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-project");
        modelAndView.addObject("usersList", userService.getAll());
        if (projectId != null) {
            System.out.println("projectID!=null");
            Project project = projectService.getById(projectId);
            modelAndView.addObject("project", project);
        } else {
            modelAndView.addObject("project", null);
        }


        return modelAndView;
    }


    @RequestMapping(value = "/create-project/{projectID}")
    public String createChildProject(@PathVariable(value = "projectID") Integer projectID) {
        return "";
    }

    @RequestMapping(value = "project/addcomment/{projectId}}", method = RequestMethod.POST)
    public void addComment(@PathVariable(value = "projectId") Integer projectId, HttpServletRequest request) {

    }

    public String addComment() {
        return "";
    }

    public String editDescription() {
        return "";
    }


}
