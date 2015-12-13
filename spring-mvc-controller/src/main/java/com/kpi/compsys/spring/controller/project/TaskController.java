package com.kpi.compsys.spring.controller.project;

import com.kpi.compsys.model.Project;
import com.kpi.compsys.model.Status;
import com.kpi.compsys.model.Task;
import com.kpi.compsys.service.ProjectService;
import com.kpi.compsys.service.StatusService;
import com.kpi.compsys.service.TaskService;
import com.kpi.compsys.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Vova on 12/5/2015.
 */
@Controller
@RequestMapping
public class TaskController {
    private static final Logger logger = Logger.getLogger(TaskController.class);
    @Autowired
    private TaskService taskService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;
    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/task")
    public ModelAndView getTaskById(@RequestParam("taskId") Integer taskId) {

        ModelAndView taskModeAndView = new ModelAndView("task-view");
        Task task = taskService.getById(taskId);
        taskModeAndView.addObject("task", task);
        taskModeAndView.addObject("statusList", Status.values());
        logger.info(task.getStatus().getStatusName());
        logger.info(Status.TASK_DONE.getStatusName());
        return taskModeAndView;

    }

    @RequestMapping(value = "/tasks")
    public ModelAndView getAllTasks() {
        ModelAndView tasksModelView = new ModelAndView();
        tasksModelView.setViewName("tasks");
        tasksModelView.addObject("taskList", taskService.getAll());
        return tasksModelView;
    }


    @RequestMapping(value = "/createtask", method = RequestMethod.POST)
    public String taskCreation(
            @RequestParam Integer projectId,
            @RequestParam Integer responsibleId,
            @RequestParam String taskName
    ) {

        Task task = new Task();
        task.setDateCreated(new Date(System.currentTimeMillis()));
        task.setDateUpdated(task.getDateCreated());
        task.setName(taskName);
        Project project = projectService.getById(projectId);
        task.setProject(project);
        task.setResponsible(userService.getById(responsibleId));
        task.setStatus(Status.TASK_TODO);
        project.getTasks().add(task);
        taskService.add(task);
        return "redirect:/project?projectID="+projectId;
    }


    @RequestMapping(value = "/createtask", method = RequestMethod.GET)
    public ModelAndView loadTaskCreation(@RequestParam Integer projectId){
        ModelAndView taskCreation = new ModelAndView("new-task");
        taskCreation.addObject("usersList", userService.getAll());
        taskCreation.addObject("projectId", projectId);
        return taskCreation;
    }
}
