package com.easylearning.easylearning.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 29.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */
@Entity
public class Chunk {
    public String text;
    @ToMany
    @JoinEntity(sourceProperty = "chunkId", targetProperty = "quizId", entity = JoinChunkWithQuizzes.class)
    public List<Quiz> quiz;
    @Id
    private Long id;
    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /**
     * Used for active entity operations.
     */
    @Generated(hash = 1822207754)
    private transient ChunkDao myDao;

    public Chunk() {
    }

    @Generated(hash = 1538769255)
    public Chunk(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 533885677)
    public List<Quiz> getQuiz() {
        if (quiz == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QuizDao targetDao = daoSession.getQuizDao();
            List<Quiz> quizNew = targetDao._queryChunk_Quiz(id);
            synchronized (this) {
                if (quiz == null) {
                    quiz = quizNew;
                }
            }
        }
        return quiz;
    }

    public void setQuiz(List<Quiz> quiz) {
        this.quiz = quiz;
    }

    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 1993448466)
    public synchronized void resetQuiz() {
        quiz = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    public void setChunk(String text, ArrayList<Quiz> quiz) {
        this.text = text;
        this.quiz = quiz;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 1018965446)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getChunkDao() : null;
    }

    

}
