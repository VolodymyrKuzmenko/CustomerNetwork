package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.StatusDao;
import com.kpi.compsys.model.StatusEntityAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class StatusDaoImpl  extends AbstractDaoImpl<StatusEntityAdapter> implements StatusDao {


    @Override
    public void saveOrUpdateStatus(StatusEntityAdapter status) {
        util.getSesssion().saveOrUpdate(status);
    }

    @Override
    public void delete(Integer id) {}

    @Override
    public StatusEntityAdapter getById(Integer id) {
        return null;
    }

    @Override
    public List<StatusEntityAdapter> getAll() {
        return null;
    }
}
