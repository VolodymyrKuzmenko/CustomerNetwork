package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.TaskDao;
import com.kpi.compsys.model.Task;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
public class TaskDaoImpl  extends AbstractDaoImpl<Task> implements TaskDao {
    @Override
    public Task getById(Integer id) {
        Task entity = (Task) util.getSesssion().load(Task.class, id);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Task task = (Task) util.getSesssion().load(Task.class, id);
        super.delete(task);
    }

    @Override
    public List<Task> getAll() {
        List<Task> list = util.getSesssion().createCriteria(Task.class).list();
        return list;
    }

}
