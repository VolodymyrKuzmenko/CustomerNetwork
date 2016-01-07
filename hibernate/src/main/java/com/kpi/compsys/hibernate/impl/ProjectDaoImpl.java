package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.ProjectDao;
import com.kpi.compsys.model.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
@Repository("projectDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ProjectDaoImpl extends AbstractDaoImpl<Project> implements ProjectDao {
    private static final Logger logger = LogManager.getLogger(ProjectDaoImpl.class);

    @Override
    public Project getById(Integer id) {
        Project entity = null;
        try {
            entity = entityManager.find(Project.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public List<Project> getAll() {
        List<Project> list = new LinkedList<>();
        try {
            list = entityManager.createNamedQuery("Project.getAll", Project.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        Project project = null;
        try {
            project = entityManager.find(Project.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(project);
    }
}
