package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.StatusDao;
import com.kpi.compsys.model.StatusEntityAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class StatusDaoImpl extends AbstractDaoImpl<StatusEntityAdapter> implements StatusDao {
    private static final Logger logger = LogManager.getLogger(StatusDaoImpl.class);

    @Override
    public void saveOrUpdateStatus(StatusEntityAdapter status) {
        try {
            util.getSesssion().saveOrUpdate(status);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public StatusEntityAdapter getById(Integer id) {
        return null;
    }

    @Override
    public List<StatusEntityAdapter> getAll() {
        return null;
    }
}
