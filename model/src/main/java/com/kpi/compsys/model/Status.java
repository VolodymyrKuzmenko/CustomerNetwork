package com.kpi.compsys.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name="Status")
public class Status  {
    private Integer statusId;

    public Status(Integer statusId, String statusName, String type) {
        this.statusId = statusId;
        this.statusName = statusName;
        this.type = type;
    }


    public Status (){}

    @Id
    @GeneratedValue
    @Column(name = "status_id")
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Column(name = "statusName")
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String statusName;
    private String type;
}
