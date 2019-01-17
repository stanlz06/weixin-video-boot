package com.stanlz.entity.vo;

import java.util.Date;
import javax.persistence.*;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class CommentsVO {
    private String id;
    private String videoId;
    private String fromUserId;
    private Date createTime;
    private String comment;
    private String faceImage;
    private String nickname;
    private String toNickname;
    private String timeAgoStr;
}