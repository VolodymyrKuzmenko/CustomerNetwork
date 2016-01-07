package com.kpi.compsys.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name = "Task")
@NamedQuery(name = "Task.getAll", query = "SELECT t FROM Task t")
public class Task implements Serializable {
    private Integer taskId;
    private String name;
    private Date dateCreated;
    private Date dateUpdated;
    private Boolean deleted;
    private User responsible;
    private Project project;
    private List<Comment> comments = new LinkedList<>();

    //    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "status")
    @Enumerated(EnumType.ORDINAL)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project", nullable = false)
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @ManyToOne
    @JoinColumn(name = "responsible", nullable = false)
    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_updated")
    public Date getDateUpdated() {
        return dateUpdated;
    }


    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "task_id")
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    private Status status;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "comment_task", joinColumns = {
            @JoinColumn(name = "Task_task_id", nullable = false, updatable = true)},
            inverseJoinColumns = {
                    @JoinColumn(name = "Comment_idComment", nullable = false, updatable = true)})
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
