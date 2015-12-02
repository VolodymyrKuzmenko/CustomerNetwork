package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao{

    @Override
    public void delete(Integer id) {
        User user = (User) util.getSesssion().load(User.class, id);
        super.delete(user);
    }

    @Override
    public User getById(Integer id) {
        return (User) util.getSesssion().load(User.class, id);
    }


    @Override
    public List<User> getAll() {
        return util.getSesssion().createCriteria(User.class).list();
    }
}
