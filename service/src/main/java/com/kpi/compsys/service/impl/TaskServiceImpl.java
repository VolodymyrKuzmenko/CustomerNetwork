package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.TaskDao;
import com.kpi.compsys.model.Task;
import com.kpi.compsys.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 12/7/2015.
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void add(Task entity) {
        taskDao.create(entity);
    }

    @Override
    public void update(Task entity) {
        taskDao.update(entity);
    }

    @Override
    public List<Task> getAll() {
        return taskDao.getAll();
    }

    @Override
    public Task getById(Integer id) {
        return taskDao.getById(id);
    }
}
