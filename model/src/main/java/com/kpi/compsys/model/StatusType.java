package com.kpi.compsys.model;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Vova on 12/13/2015.
 */
public enum StatusType {
    TASK_TODO(1,"In integration", "project"),
    TASK_IN_PROGRESS(2,"In progress", "project"),
    TASK_DONE(3,"Done", "project"),
    TASK_TESTING(4,"In testing", "project"),
    TASK_REVIEW(5,"In review", "project"),

    PROJECT_TODO(6,"TODO", "project"),
    PROJECT_IN_PROGRESS(7,"In progress", "project"),
    PROJECT_DONE(8,"Done", "project"),
    PROJECT_TESTING(9,"In testing", "project"),
    PROJECT_PRODUCTION(10,"In production", "project"),
    PROJECT_INTEGRATION(11,"In integration", "project");

    private static final HashMap <Integer, Status> statusPool = new LinkedHashMap<>();

    private final Integer id;
    private final String statusName;
    private final String type;


    StatusType(Integer id, String statusName, String type) {
        this.id = id;
        this.statusName = statusName;
        this.type = type;
    }

    public Status asStatus(){
        Status status;
        if ( !statusPool.containsKey(id)){
            status = new Status(id,statusName,type);
            statusPool.put(id,status);
        }else {
            status = statusPool.get(id);
        }
        return status;
    }


}
