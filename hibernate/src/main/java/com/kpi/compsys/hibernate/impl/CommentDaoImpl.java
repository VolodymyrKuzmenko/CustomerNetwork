package com.kpi.compsys.hibernate.impl;

import com.kpi.compsys.dao.CommentDao;
import com.kpi.compsys.model.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vova on 11/27/2015.
 */
@Component
public class CommentDaoImpl extends AbstractDaoImpl<Comment> implements CommentDao {
    @Override
    public Comment getById(Integer id) {
        Comment entity = (Comment) util.getSesssion().load(Comment.class, id);
        return entity;
    }

    @Override
    public List<Comment> getAll() {
        List<Comment> list = util.getSesssion().createCriteria(Comment.class).list();
        return list;
    }

    @Override
    public void delete(Integer id) {
        Comment comment = (Comment) util.getSesssion().load(Comment.class, id);
        super.delete(comment);
    }
}
