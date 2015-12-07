package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.model.Project;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.CommentService;
import com.kpi.compsys.service.ProjectService;
import com.kpi.compsys.service.UserService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Vova on 12/4/2015.
 */
@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/projects")
    public ModelAndView getUserProjects() {
        ModelAndView projectsModelView = new ModelAndView();
        projectsModelView.setViewName("projects");
        projectsModelView.addObject("projectsList", projectService.getAll());

        return projectsModelView;
    }

    @RequestMapping(value = "/project/{projectID}")
    public ModelAndView getProjectById(@PathVariable(value = "projectID") Integer projectID) {
        ModelAndView projectModelView = new ModelAndView();
        projectModelView.setViewName("project-view");
        Project project = projectService.getById(projectID);
        projectModelView.addObject("project", project);
        projectModelView.addObject("child-projects", projectService.getChildProjects(projectID));
        return projectModelView;
    }

    @RequestMapping(value = "new-project", method = RequestMethod.POST)
    public String createProject(
            @RequestParam String name,
            @RequestParam User responsible,
            @RequestParam String description) {

        Project project = new Project();
        project.setDateCreated(new Date(System.currentTimeMillis()));
        project.setDescriprion(description);
        project.setName(name);
        project.setResponsible(responsible);
        projectService.add(project);
        return "projects";
    }

    @RequestMapping(value = "/new-project", method = RequestMethod.GET)
    public ModelAndView loadUsersForCreateProject(){
        System.out.println("GET work new proect");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-project");
        modelAndView.addObject("usersList",userService.getAll());

        return modelAndView;
    }

    @RequestMapping(value = "/create-project/{projectID}")
    public String createChildProject(@PathVariable(value = "projectID") Integer projectID){
        return "";
    }

    @RequestMapping(value = "project/addcomment/{projectId}}", method = RequestMethod.POST)
    public void addComment(@PathVariable (value = "projectId") Integer projectId, HttpServletRequest request){

    }

    public String addComment() {
        return "";
    }

    public String editDescription() {
        return "";
    }


}
