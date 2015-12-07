package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vova on 12/5/2015.
 */
@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/task/{taskId}}")
    public ModelAndView getTaskById(@PathVariable(value = "taskId") Integer taskId){
        ModelAndView taskModeAndView = new ModelAndView("");
        return taskModeAndView;

    }

    @RequestMapping(value = "/tasks")
    public ModelAndView getAllTasks(){
        ModelAndView tasksModelView = new ModelAndView();
        tasksModelView.setViewName("tasks");
        tasksModelView.addObject("taskList", taskService.getAll());
        return tasksModelView;
    }


    @RequestMapping(value = "/task-create/{projectId}")
    public ModelAndView taskCreation(@PathVariable (value = "projectId") Integer projectId){
        return null;
    }
}
