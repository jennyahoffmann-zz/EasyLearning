package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Malcolm-X on 03.12.2016.
 */
@Entity
public class JoinTopicsWithUnits {
    @Id
    private long id;
    private long topicId;
    private long unitId;

    @Generated(hash = 977705529)
    public JoinTopicsWithUnits(long id, long topicId, long unitId) {
        this.id = id;
        this.topicId = topicId;
        this.unitId = unitId;
    }

    @Generated(hash = 33979063)
    public JoinTopicsWithUnits() {
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

    public long getUnitId() {
        return this.unitId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

}
