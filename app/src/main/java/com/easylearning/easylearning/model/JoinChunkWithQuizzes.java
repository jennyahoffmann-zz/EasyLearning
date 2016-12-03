package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
@Entity
public class JoinChunkWithQuizzes {
    @Id
    private long id;
    private long chunkId, quizId;

    @Generated(hash = 2051412461)
    public JoinChunkWithQuizzes(long id, long chunkId, long quizId) {
        this.id = id;
        this.chunkId = chunkId;
        this.quizId = quizId;
    }

    @Generated(hash = 203369508)
    public JoinChunkWithQuizzes() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChunkId() {
        return this.chunkId;
    }

    public void setChunkId(long chunkId) {
        this.chunkId = chunkId;
    }

    public long getQuizId() {
        return this.quizId;
    }

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }
}
