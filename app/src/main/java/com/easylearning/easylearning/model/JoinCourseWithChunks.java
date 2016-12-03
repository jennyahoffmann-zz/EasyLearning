package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
@Entity
public class JoinCourseWithChunks {
    @Id
    private long id;

    private long courseId;
    private long chunkId;

    @Generated(hash = 1465779183)
    public JoinCourseWithChunks(long id, long courseId, long chunkId) {
        this.id = id;
        this.courseId = courseId;
        this.chunkId = chunkId;
    }

    @Generated(hash = 1042383168)
    public JoinCourseWithChunks() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getChunkId() {
        return this.chunkId;
    }

    public void setChunkId(long chunkId) {
        this.chunkId = chunkId;
    }
}
