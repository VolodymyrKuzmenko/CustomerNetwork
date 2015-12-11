package com.kpi.compsys.service;

import com.kpi.compsys.model.UserRole;

/**
 * Created by Vova on 12/6/2015.
 */
public interface UserRoleService extends EntityService<UserRole> {

    UserRole getDefaultUserRole();
}
