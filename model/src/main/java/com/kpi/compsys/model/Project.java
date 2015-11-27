package com.kpi.compsys.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name= "Project")
public class Project {
    private Integer id;
    private String name;
    private Status status;
    private Project parrentProject;
    private String descriprion;
    private Date dateCreated;
    private Date dateUpdated;
    private User responsible;
    private List<Comment> comments;
    private List<Task> tasks;

    @Id
    @GeneratedValue
    @Column(name = "project_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "parrent_project")
    public Project getParrentProject() {
        return parrentProject;
    }

    public void setParrentProject(Project parrentProject) {
        this.parrentProject = parrentProject;
    }

    @Column(name = "description")
    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_created")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_updated")
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @JoinColumn(name = "responsible")
    @OneToOne
    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "comment_project", joinColumns = {
            @JoinColumn(name = "project_id", nullable = false, updatable = true)},
            inverseJoinColumns = {
                    @JoinColumn(name = "comment_id", nullable = false, updatable = true)})
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="Task", joinColumns={@JoinColumn(name = "task_id", nullable = false, updatable = true)})
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
