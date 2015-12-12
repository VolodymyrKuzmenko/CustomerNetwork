package com.kpi.compsys.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vova on 11/27/2015.
 */

@Entity
@Table(name="UserRole")
public class UserRole implements Serializable {

    private Integer roleId;

    @Column(name="role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Id
    @GeneratedValue
    @Column(name="role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    private String roleName;

}
