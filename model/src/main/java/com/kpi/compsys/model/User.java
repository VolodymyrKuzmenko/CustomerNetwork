package com.kpi.compsys.model;

/**
 * Created by Vova on 10/12/2015.
 */

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "user")
@NamedQuery(name = "User.getAll", query = "SELECT u FROM User u")
public class User implements Serializable {

    private int id;
    private String email;
    private String password;

    @NotFound(action = NotFoundAction.IGNORE)
    @OneToOne
    @JoinColumn(name = "manager", nullable = true)
    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    @JoinColumn(name = "role")
    @OneToOne
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    private User manager;
    private UserRole role;

    @Id
    @GeneratedValue()
    @Column(name = "user_id")
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @NotFound(action = NotFoundAction.IGNORE)
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    private UserInfo userInfo;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_comment", joinColumns = {
            @JoinColumn(name = "user_user_id", nullable = false, updatable = true)},
            inverseJoinColumns = {
                    @JoinColumn(name = "Comment_idComment", nullable = false, updatable = true)})
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    private List<Comment> comments = new LinkedList<>();

    public User(User user) {
        this.comments = user.comments;
        this.email = user.email;
        this.id = user.id;
        this.manager = user.manager;
        this.password = user.password;
        this.role = user.role;
        this.userInfo = user.userInfo;
    }

    public User() {

    }


}
