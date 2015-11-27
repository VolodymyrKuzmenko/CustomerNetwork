package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.FileDao;
import com.kpi.compsys.model.File;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
public class FileDaoImpl  extends AbstractDaoImpl<File> implements FileDao {
    @Override
    public File getById(Integer id) {
        File entity = (File) util.getSesssion().load(File.class, id);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        File file = (File) util.getSesssion().load(File.class, id);
        super.delete(file);
    }

    @Override
    public List<File> getAll() {
        List<File> list = util.getSesssion().createCriteria(File.class).list();
        return list;
    }

}
