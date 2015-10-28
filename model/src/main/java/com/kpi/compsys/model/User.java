package com.kpi.compsys.model;

/**
 * Created by Vova on 10/12/2015.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    private int id;
    private String email;
    private String password;
    private int status;

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="user_id")
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="status")
    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }
}
