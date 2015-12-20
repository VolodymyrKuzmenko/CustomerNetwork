package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.FileDao;
import com.kpi.compsys.model.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class FileDaoImpl extends AbstractDaoImpl<File> implements FileDao {
    private static final Logger logger = LogManager.getLogger(FileDaoImpl.class);

    @Override
    public File getById(Integer id) {
        File entity = null;
        try {
            entity = (File) util.getSesssion().load(File.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        File file = null;
        try {
            file = (File) util.getSesssion().load(File.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        super.delete(file);
    }

    @Override
    public List<File> getAll() {
        List<File> list = null;
        try {
            list = util.getSesssion().createCriteria(File.class).list();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
            util.dataBaseNotResponse();
        }
        return list;
    }

}
