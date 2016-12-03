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
public class Course {
    @ToMany
    @JoinEntity(
            entity = JoinCourseWithChunks.class,
            sourceProperty = "courseId",
            targetProperty = "chunkId"
    )
    public List<Chunk> chunks;
    @ToMany
    @JoinEntity(
            entity = JoinCourseWithTopics.class,
            sourceProperty = "courseId",
            targetProperty = "topicId"
    )
    public List<Topic> topics;
    @Id
    private Long id;
    /**
     * displayed data
     */
    private String title, descriptionShort, descriptionLong, thumbnailRef, imgRef;
    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    @Generated(hash = 2063667503)
    private transient CourseDao myDao;

    @Generated(hash = 1701313878)
    public Course(Long id, String title, String descriptionShort,
                  String descriptionLong, String thumbnailRef, String imgRef) {
        this.id = id;
        this.title = title;
        this.descriptionShort = descriptionShort;
        this.descriptionLong = descriptionLong;
        this.thumbnailRef = thumbnailRef;
        this.imgRef = imgRef;
    }

    @Generated(hash = 1355838961)
    public Course() {
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
    @Generated(hash = 1225167807)
    public List<Chunk> getChunks() {
        if (chunks == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ChunkDao targetDao = daoSession.getChunkDao();
            List<Chunk> chunksNew = targetDao._queryCourse_Chunks(id);
            synchronized (this) {
                if (chunks == null) {
                    chunks = chunksNew;
                }
            }
        }
        return chunks;
    }

    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 1036845323)
    public synchronized void resetChunks() {
        chunks = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1864589585)
    public List<Topic> getTopics() {
        if (topics == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TopicDao targetDao = daoSession.getTopicDao();
            List<Topic> topicsNew = targetDao._queryCourse_Topics(id);
            synchronized (this) {
                if (topics == null) {
                    topics = topicsNew;
                }
            }
        }
        return topics;
    }

    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 1067351932)
    public synchronized void resetTopics() {
        topics = null;
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
    @Generated(hash = 94420068)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCourseDao() : null;
    }
}
