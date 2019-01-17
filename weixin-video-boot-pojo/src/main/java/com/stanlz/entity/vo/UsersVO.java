package com.stanlz.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Data
public class UsersVO {
    private String id;
	private String userToken;
	private boolean isFollow;
    private String username;
    @JsonIgnore
    private String password;
    private String faceImage;
    private String nickname;
    private Integer fansCounts;
    private Integer followCounts;
    private Integer receiveLikeCounts;
}