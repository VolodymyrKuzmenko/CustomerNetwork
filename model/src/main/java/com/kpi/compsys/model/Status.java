package com.kpi.compsys.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 12/13/2015.
 */
public enum Status {
    TASK_TODO(1,"TODO", "task"),
    TASK_IN_PROGRESS(2,"In progress", "task"),
    TASK_DONE(3,"DONE", "task"),
    TASK_TESTING(4,"In testing", "task"),
    TASK_REVIEW(5,"In review", "task"),

    PROJECT_TODO(6,"TODO", "project"),
    PROJECT_IN_PROGRESS(7,"In progress", "project"),
    PROJECT_DONE(8,"DONE", "project"),
    PROJECT_TESTING(9,"In testing", "project"),
    PROJECT_PRODUCTION(10,"In production", "project"),
    PROJECT_INTEGRATION(11,"In integration", "project");

    private final StatusEntityAdapter statusEntityAdapter;
    private static final String projectType = "project";
    private static final String taskType = "task";
    private static boolean isNotSorted = true;

    private static final List<Status> taskStatuses = new LinkedList<>();

    public static List<Status> getProjectStatuses() {
        return projectStatuses;
    }

    public static List<Status> getTaskStatuses() {
        return taskStatuses;
    }

    private static final List<Status> projectStatuses = new LinkedList<>();

    public Integer getId(){
        return this.statusEntityAdapter.getStatusId();
    }

    public String getStatusName(){
        return statusEntityAdapter.getStatusName();
    }

    Status(Integer id, String statusName, String type) {
        statusEntityAdapter = new StatusEntityAdapter(id, statusName,type);
    }

    public StatusEntityAdapter asStatus(){
        return statusEntityAdapter;
    }

    public static void sortByFunction(){
        if (isNotSorted)
        for (Status status : Status.values()){
            if (status.statusEntityAdapter.getType().equals(projectType)){
                projectStatuses.add(status);
            }else{
                taskStatuses.add(status);
            }
        }
    }

}
