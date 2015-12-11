package com.kpi.compsys.service;

import com.kpi.compsys.model.User;

import java.util.List;

/**
 * Created by Vova on 11/26/2015.
 */
public interface UserService extends EntityService <User> {
    List<User> getByEmail(String email);

}
