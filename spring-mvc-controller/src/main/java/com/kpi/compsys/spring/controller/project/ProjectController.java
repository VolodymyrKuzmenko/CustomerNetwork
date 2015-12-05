package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.model.Project;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Vova on 12/4/2015.
 */
@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/projects")
    public ModelAndView getUserProjects() {
        ModelAndView projectsModelView = new ModelAndView();
        projectsModelView.setViewName("projectsList");
        projectsModelView.addObject("projects", projectService.getAll());

        return projectsModelView;
    }

    @RequestMapping(value = "/projects/{projectID}")
    public ModelAndView getProjectById(@PathVariable(value = "projectID") Integer projectID) {
        ModelAndView projectModelView = new ModelAndView();
        projectModelView.setViewName("projectView");
        projectModelView.addObject("project", projectService.getById(projectID));
        return projectModelView;
    }

    @RequestMapping(value = "/projects")
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

    public String addComment() {
        return "";
    }

    public String editDescription() {
        return "";
    }


}
