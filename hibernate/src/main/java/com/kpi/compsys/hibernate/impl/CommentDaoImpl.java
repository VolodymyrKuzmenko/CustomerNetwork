package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.CommentDao;
import com.kpi.compsys.model.Comment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class CommentDaoImpl extends AbstractDaoImpl<Comment> implements CommentDao {
    private static final Logger logger = LogManager.getLogger(CommentDaoImpl.class);
    @Override
    public Comment getById(Integer id) {
        Comment entity = null;
        try{
        entity = (Comment) util.getSesssion().load(Comment.class, id);
    }catch (JDBCConnectionException e){
        logger.warn("Error execution query");
        util.dataBaseNotResponse();
    }
        return entity;
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> list = null;
        try{
        list = util.getSesssion().createCriteria(Comment.class).list();
    }catch (JDBCConnectionException e){
        logger.warn("Error execution query");
        util.dataBaseNotResponse();
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        Comment comment = null;
        try{
        comment = (Comment) util.getSesssion().load(Comment.class, id);
        }catch (JDBCConnectionException e){
        logger.warn("Error execution query");
        util.dataBaseNotResponse();
        }
        super.delete(comment);
    }
}
