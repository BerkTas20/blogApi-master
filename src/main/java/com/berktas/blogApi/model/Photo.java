package com.berktas.blogApi.model;

import com.berktas.blogApi.core.entity.AbstractTimestampEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Photo extends AbstractTimestampEntity {

    @Lob
    private byte[] data;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    // Photo.java
    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
