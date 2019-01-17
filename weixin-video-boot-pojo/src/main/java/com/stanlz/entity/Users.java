package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Users {
    @Id
    private String id;

    private String username;

    private String password;

    @Column(name = "face_image")
    private String faceImage;

    private String nickname;

    @Column(name = "fans_counts")
    private Integer fansCounts;

    @Column(name = "follow_counts")
    private Integer followCounts;

    @Column(name = "receive_like_counts")
    private Integer receiveLikeCounts;
}