package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.ProjectDao;
import com.kpi.compsys.model.Project;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
public class ProjectDaoImpl  extends AbstractDaoImpl<Project> implements ProjectDao {
    @Override
    public Project getById(Integer id) {
        Project entity = (Project) util.getSesssion().load(Project.class, id);
        return entity;
    }

    @Override
    public List<Project> getAll() {
        List<Project> list = util.getSesssion().createCriteria(Project.class).list();
        return list;
    }

    @Override
    public void delete(Integer id) {
        Project project = (Project) util.getSesssion().load(Project.class, id);
        super.delete(project);
    }
}
