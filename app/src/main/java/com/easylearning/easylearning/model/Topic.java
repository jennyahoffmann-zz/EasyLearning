package com.easylearning.easylearning.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * Created by Malcolm-X on 02.12.2016.
 */
@Entity(indexes = {
        @Index(value = "title DESC", unique = true)
})
public class Topic {
    @Id
    private Long id;
    private String title, descriptionShort, descriptionLong, thumbnailRef, imgRef;
    @ToMany
    @JoinEntity(
            entity = JoinTopicsWithUnits.class,
            sourceProperty = "topicId",
            targetProperty = "unitId"
    )
    private List<Unit> units;
    @ToMany
    @JoinEntity(
            entity = JoinTopicsWithQuizzes.class,
            sourceProperty = "topicId",
            targetProperty = "quizId"
    )
    private List<Quiz> quizzes;
    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /**
     * Used for active entity operations.
     */
    @Generated(hash = 694021448)
    private transient TopicDao myDao;

    @Generated(hash = 915038957)
    public Topic(Long id, String title, String descriptionShort,
                 String descriptionLong, String thumbnailRef, String imgRef) {
        this.id = id;
        this.title = title;
        this.descriptionShort = descriptionShort;
        this.descriptionLong = descriptionLong;
        this.thumbnailRef = thumbnailRef;
        this.imgRef = imgRef;
    }

    @Generated(hash = 849012203)
    public Topic() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionShort() {
        return this.descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescriptionLong() {
        return this.descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public String getThumbnailRef() {
        return this.thumbnailRef;
    }

    public void setThumbnailRef(String thumbnailRef) {
        this.thumbnailRef = thumbnailRef;
    }

    public String getImgRef() {
        return this.imgRef;
    }

    public void setImgRef(String imgRef) {
        this.imgRef = imgRef;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 2038176639)
    public List<Unit> getUnits() {
        if (units == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UnitDao targetDao = daoSession.getUnitDao();
            List<Unit> unitsNew = targetDao._queryTopic_Units(id);
            synchronized (this) {
                if (units == null) {
                    units = unitsNew;
                }
            }
        }
        return units;
    }

    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 121816020)
    public synchronized void resetUnits() {
        units = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 48361563)
    public List<Quiz> getQuizzes() {
        if (quizzes == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QuizDao targetDao = daoSession.getQuizDao();
            List<Quiz> quizzesNew = targetDao._queryTopic_Quizzes(id);
            synchronized (this) {
                if (quizzes == null) {
                    quizzes = quizzesNew;
                }
            }
        }
        return quizzes;
    }

    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 639533054)
    public synchronized void resetQuizzes() {
        quizzes = null;
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

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 1373867845)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTopicDao() : null;
    }
}
