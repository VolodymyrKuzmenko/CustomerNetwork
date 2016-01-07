package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.CommentDao;
import com.kpi.compsys.model.Comment;
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
@Repository("commentDao")
@Transactional(propagation = Propagation.REQUIRED)
public class CommentDaoImpl extends AbstractDaoImpl<Comment> implements CommentDao {
    private static final Logger logger = LogManager.getLogger(CommentDaoImpl.class);

    @Override
    public Comment getById(Integer id) {
        Comment entity = null;
        try {
            entity = entityManager.find(Comment.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return entity;
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> list = null;
        try {
            javax.persistence.Query query = entityManager.createNamedQuery("Comment.getAll", Comment.class);
            list = query.getResultList();
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        Comment comment = null;
        try {
            comment = entityManager.find(Comment.class, id);
        } catch (JDBCConnectionException e) {
            logger.warn("Error execution query");
        }
        super.delete(comment);
    }
}
