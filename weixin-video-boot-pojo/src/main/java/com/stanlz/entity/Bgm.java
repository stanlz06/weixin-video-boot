package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Bgm {
    @Id
    /* 主键Id */
    private String id;

    /* bgm作者名称 */
    private String author;

    /* bgm名称 */
    private String name;

    /* bgm保存的相对路径 */
    private String path;
}