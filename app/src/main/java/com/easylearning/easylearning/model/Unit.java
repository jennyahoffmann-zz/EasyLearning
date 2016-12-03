package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

/**
 * Created by Malcolm-X on 02.12.2016.
 */
@Entity(indexes = {
        @Index(value = "title DESC", unique = true)
})
public class Unit {
    String title, descriptionShort, descriptionLong, thumbnailRef, imgRef;
    @Id
    private Long id;

    @Generated(hash = 1925105738)
    public Unit(Long id, String title, String descriptionShort,
                String descriptionLong, String thumbnailRef, String imgRef) {
        this.id = id;
        this.title = title;
        this.descriptionShort = descriptionShort;
        this.descriptionLong = descriptionLong;
        this.thumbnailRef = thumbnailRef;
        this.imgRef = imgRef;
    }

    @Generated(hash = 1236212320)
    public Unit() {
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
}
