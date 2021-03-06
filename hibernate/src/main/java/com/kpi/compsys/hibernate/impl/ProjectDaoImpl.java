package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.ProjectDao;
import com.kpi.compsys.model.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.core.ExceptionDepthComparator;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class ProjectDaoImpl  extends AbstractDaoImpl<Project> implements ProjectDao {
    private static final Logger logger = LogManager.getLogger(ProjectDaoImpl.class);
    @Override
    public Project getById(Integer id) {
        Project entity = null;
        try{
        entity = (Project) util.getSesssion().load(Project.class, id);
        }catch (JDBCConnectionException e){
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }

    @Override
    public List<Project> getAll() {
        List<Project> list = new LinkedList<>();
        try{
             list = util.getSesssion().createCriteria(Project.class).list();
        }catch (JDBCConnectionException e){
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        Project project = null;
        try{
        project = (Project) util.getSesssion().load(Project.class, id);
    }catch (JDBCConnectionException e){
        logger.warn("Error execution query");
        util.dataBaseNotResponse();
    }
        super.delete(project);
    }
}
