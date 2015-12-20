package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.TaskDao;
import com.kpi.compsys.model.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class TaskDaoImpl extends AbstractDaoImpl<Task> implements TaskDao {
    private static final Logger logger = LogManager.getLogger(TaskDaoImpl.class);

    @Override
    public Task getById(Integer id) {
        Task entity = null;
        try {
            entity = (Task) util.getSesssion().load(Task.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Task task = null;
        try {
            task = (Task) util.getSesssion().load(Task.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(task);
    }

    @Override
    public List<Task> getAll() {
        List<Task> list = null;
        try {
            list = util.getSesssion().createCriteria(Task.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

}
