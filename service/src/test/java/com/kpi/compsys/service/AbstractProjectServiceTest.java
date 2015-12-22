package com.kpi.compsys.service;

import com.kpi.compsys.model.Project;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;


/**
 * Created by Vova on 12/23/2015.
 */
public abstract class AbstractProjectServiceTest {

    @Autowired
    protected ProjectService projectService;

    @Test
    public void shouldShowChildProjectsByProjectId() throws Exception {


        List<Project> childProjects = projectService.getChildProjects(1);

        Project chld1 = projectService.getById(6);
        Project chld2 = projectService.getById(5);
        Project chld3 = projectService.getById(4);

        assertThat(childProjects.contains(chld1));
        assertThat(childProjects.contains(chld2));
        assertThat(childProjects.contains(chld3));

    }
}