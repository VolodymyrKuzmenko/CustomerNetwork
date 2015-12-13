package com.kpi.compsys.dao;

import com.kpi.compsys.model.StatusEntityAdapter;

/**
 * Created by Vova on 11/27/2015.
 */
public interface StatusDao extends AbstractDao<StatusEntityAdapter> {

    void saveOrUpdateStatus(StatusEntityAdapter projectStatus);
}
