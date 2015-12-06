package com.kpi.compsys.spring.controller.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vova on 12/5/2015.
 */
@Controller
public class TaskController {

    @RequestMapping(value = "/task/{taskId}}")
    public ModelAndView getTaskById(@PathVariable(value = "taskId") Integer taskId){
        return null;

    }


    @RequestMapping(value = "/task-create/{projectId}")
    public ModelAndView taskCreation(@PathVariable (value = "projectId") Integer projectId){
        return null;
    }
}
