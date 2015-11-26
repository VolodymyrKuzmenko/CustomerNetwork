package com.kpi.compsys.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name = "Task")
public class Task {
    private Integer taskId;
    private String name;
    private Date dateCreated;
    private Date dateUpdated;
    private Boolean deleted;
    private User responsible;
    private Project project;
    private Status status;
}
