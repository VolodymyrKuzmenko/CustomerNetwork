package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.StatusDao;
import com.kpi.compsys.model.Status;
import com.kpi.compsys.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vova on 12/11/2015.
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusDao statusDao;

    @Override
    public Status getTODOStatus() {
        return statusDao.getById(6);
    }

    @Override
    public Status getInProgressStatus() {
        return statusDao.getById(7);
    }

    @Override
    public Status getTestingStatus() {
        return statusDao.getById(8);
    }

    @Override
    public Status getDoneStatus() {
        return statusDao.getById(9);
    }

    @Override
    public void add(Status entity) {

    }

    @Override
    public void update(Status entity) {

    }

    @Override
    public List<Status> getAll() {
        return null;
    }

    @Override
    public Status getById(Integer id) {
        return null;
    }
}
