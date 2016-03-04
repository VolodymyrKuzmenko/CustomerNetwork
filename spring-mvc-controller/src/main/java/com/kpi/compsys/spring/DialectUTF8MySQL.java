package com.kpi.compsys.spring;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * Created by Babenko on 14.12.2015.
 */
public class DialectUTF8MySQL extends MySQL5InnoDBDialect {
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
