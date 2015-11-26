package com.kpi.compsys.dao;

import java.util.List;

/**
 * Created by Vova on 10/12/2015.
 */
public interface AbstractDao<T> {
    T create (T entity);
    void delete (T entity);
    T update (T entity);
    T getById(Integer id);
    List<T> getAll();
    List<T> getByFilter(String query);

}
