package com.kpi.compsys.service;

import java.util.List;

/**
 * Created by Vova on 11/26/2015.
 */
public interface EntityService <T> {
    void add(T entity);
    void update (T entity);
    List<T> getAll();
    T getById(Integer id);
}
