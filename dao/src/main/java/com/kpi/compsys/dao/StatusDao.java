package com.kpi.compsys.dao;

import com.kpi.compsys.model.Status;
import com.kpi.compsys.model.StatusType;

/**
 * Created by Vova on 11/27/2015.
 */
public interface StatusDao extends AbstractDao<Status> {

    void saveOrUpdateStatus(StatusType statusType);
}
