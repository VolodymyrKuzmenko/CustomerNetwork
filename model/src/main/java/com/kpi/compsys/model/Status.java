package com.kpi.compsys.model;

/**
 * Created by Vova on 12/13/2015.
 */
public enum Status {
    TASK_TODO(1,"In integration"),
    TASK_IN_PROGRESS(2,"In progress"),
    TASK_DONE(3,"Done"),
    TASK_TESTING(4,"In testing"),
    TASK_REVIEW(5,"In review"),

    PROJECT_TODO(6,"TODO"),
    PROJECT_IN_PROGRESS(7,"In progress"),
    PROJECT_DONE(8,"Done"),
    PROJECT_TESTING(9,"In testing"),
    PROJECT_PRODUCTION(10,"In production"),
    PROJECT_INTEGRATION(11,"In integration");

    private final StatusEntityAdapter statusEntityAdapter;
    private final String type = "project";

    public Integer getId(){
        return this.statusEntityAdapter.getStatusId();
    }

    public String getStatusName(){
        return statusEntityAdapter.getStatusName();
    }

    Status(Integer id, String statusName) {
        statusEntityAdapter = new StatusEntityAdapter(id, statusName,type);
    }

    public StatusEntityAdapter asStatus(){
        return statusEntityAdapter;
    }

}
