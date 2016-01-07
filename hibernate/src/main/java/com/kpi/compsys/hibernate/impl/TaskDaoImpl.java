package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.TaskDao;
import com.kpi.compsys.model.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
@Repository("taskDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TaskDaoImpl extends AbstractDaoImpl<Task> implements TaskDao {
    private static final Logger logger = LogManager.getLogger(TaskDaoImpl.class);

    @Override
    public Task getById(Integer id) {
        Task entity = null;
        try {
            entity = entityManager.find(Task.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Task task = null;
        try {
            task = entityManager.find(Task.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(task);
    }

    @Override
    public List<Task> getAll() {
        List<Task> list = null;
        try {
            list = entityManager.createNamedQuery("Task.getAll", Task.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

}
