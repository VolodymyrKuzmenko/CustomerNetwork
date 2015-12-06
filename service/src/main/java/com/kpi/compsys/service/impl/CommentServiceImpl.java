package com.kpi.compsys.service.impl;

import com.kpi.compsys.dao.CommentDao;
import com.kpi.compsys.dao.UserDao;
import com.kpi.compsys.model.Comment;
import com.kpi.compsys.model.User;
import com.kpi.compsys.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vova on 12/6/2015.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;


    @Override
    public void add(Comment entity) {
        commentDao.create(entity);
    }

    @Override
    public void update(Comment entity) {
        commentDao.update(entity);
    }

    @Override
    public List<Comment> getAll() {
        commentDao.getAll();
        return null;
    }

    @Override
    public Comment getById(Integer id) {
        return commentDao.getById(id);
    }

}
