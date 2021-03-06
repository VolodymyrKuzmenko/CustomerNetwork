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


    private StatusDao statusDao;

    @Autowired
    public StatusServiceImpl(StatusDao statusDao){
        this.statusDao = statusDao;

        Status.sortByFunction();
        for (Status status : Status.values()){
            statusDao.saveOrUpdateStatus(status.asStatus());
        }


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
