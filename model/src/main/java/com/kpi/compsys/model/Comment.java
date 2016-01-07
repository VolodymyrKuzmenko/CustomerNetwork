package com.kpi.compsys.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vova on 11/27/2015.
 */
@Table(name="Comment")
@Entity
@NamedQuery(name = "Comment.getAll", query = "SELECT c FROM Comment c")
public class Comment implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "idComment")
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
    @Column(name = "text")
    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
    @Column(name = "date_created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    @Column(name = "date_updated")
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    private Integer commentId;
    private String textComment;
    private Date created;
    private Date updated;
    private Boolean deleted;

    @ManyToOne (cascade=CascadeType.ALL)
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    private User author;

}
