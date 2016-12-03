package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
@Entity
public class JoinTopicsWithQuizzes {
    @Id
    private long id;
    private long topicId;
    private long quizId;

    @Generated(hash = 1921833377)
    public JoinTopicsWithQuizzes(long id, long topicId, long quizId) {
        this.id = id;
        this.topicId = topicId;
        this.quizId = quizId;
    }

    @Generated(hash = 411208948)
    public JoinTopicsWithQuizzes() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTopicId() {
        return this.topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public long getQuizId() {
        return this.quizId;
    }

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }
}
