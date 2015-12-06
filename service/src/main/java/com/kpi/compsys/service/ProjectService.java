package com.kpi.compsys.service;

import com.kpi.compsys.model.Comment;
import com.kpi.compsys.model.Project;

import java.util.List;

/**
 * Created by Vova on 12/4/2015.
 */
public interface ProjectService extends EntityService<Project> {
    List<Project> getChildProjects(Integer parrentProjectId);
}
