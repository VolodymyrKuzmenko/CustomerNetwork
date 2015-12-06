package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.ProjectDao;
import com.kpi.compsys.model.Project;
import com.kpi.compsys.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 12/5/2015.
 */
@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public void add(Project entity) {
        projectDao.create(entity);
    }

    @Override
    public void update(Project entity) {
        projectDao.create(entity);
    }

    @Override
    public List<Project> getAll() {
        return projectDao.getAll();
    }

    @Override
    public Project getById(Integer id) {
        return projectDao.getById(id);
    }
}
