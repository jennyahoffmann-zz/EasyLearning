package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
@Entity
public class JoinCourseWithTopics {
    @Id
    private long id;

    private long courseId;
    private long topicId;

    @Generated(hash = 1500119970)
    public JoinCourseWithTopics(long id, long courseId, long topicId) {
        this.id = id;
        this.courseId = courseId;
        this.topicId = topicId;
    }

    @Generated(hash = 2080257493)
    public JoinCourseWithTopics() {
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

    public long getTopicId() {
        return this.topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }
}
