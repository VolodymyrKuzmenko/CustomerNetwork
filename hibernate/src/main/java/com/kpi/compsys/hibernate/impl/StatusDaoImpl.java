package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.StatusDao;
import com.kpi.compsys.model.Status;
import com.kpi.compsys.model.StatusType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class StatusDaoImpl  extends AbstractDaoImpl<Status> implements StatusDao {
    @Override
    public Status getById(Integer id) {
        Status entity = (Status) util.getSesssion().load(Status.class, id);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Status status = (Status) util.getSesssion().load(Status.class, id);
        super.delete(status);
    }

    @Override
    public List<Status> getAll() {
        List<Status> list = util.getSesssion().createCriteria(Status.class).list();
        return list;
    }

    @Override
    public void saveOrUpdateStatus(StatusType statusType) {
        util.getSesssion().saveOrUpdate(statusType.asStatus());
    }
}
