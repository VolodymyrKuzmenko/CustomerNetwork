package com.kpi.compsys.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name = "SessionHistory")
@NamedQuery(name = "SessionHistory.getAll", query = "SELECT s FROM SessionHistory s")
public class SessionHistory implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "idSessionHistory")
    public Integer getIdSessionHistory() {
        return idSessionHistory;
    }

    public void setIdSessionHistory(Integer idSessionHistory) {
        this.idSessionHistory = idSessionHistory;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @OneToOne
    @JoinColumn(name = "user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "ip_address")
    public String getIpAddres() {
        return ipAddres;
    }

    public void setIpAddres(String ipAddres) {
        this.ipAddres = ipAddres;
    }

    @Column(name = "brouser_type")
    public String getBrouserType() {
        return brouserType;
    }

    public void setBrouserType(String brouserType) {
        this.brouserType = brouserType;
    }

    private Integer idSessionHistory;
    private Date date;
    private User user;
    private String ipAddres;
    private String brouserType;
}
