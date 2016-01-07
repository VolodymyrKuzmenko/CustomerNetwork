package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.FileDao;
import com.kpi.compsys.model.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
@Repository("fileDao")
@Transactional(propagation = Propagation.REQUIRED)
public class FileDaoImpl extends AbstractDaoImpl<File> implements FileDao {
    private static final Logger logger = LogManager.getLogger(FileDaoImpl.class);

    @Override
    public File getById(Integer id) {
        File entity = null;
        try {
            entity = entityManager.find(File.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public void delete(Integer id) {
        File file = null;
        try {
            file = entityManager.find(File.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(file);
    }

    @Override
    public List<File> getAll() {
        List<File> list = null;
        try {
            list = entityManager.createNamedQuery("File.getAll", File.class).getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

}
