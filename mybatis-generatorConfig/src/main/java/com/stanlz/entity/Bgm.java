package com.stanlz.entity;

import javax.persistence.*;

public class Bgm {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * BGM作者名称
     */
    private String author;

    /**
     * BGM名称
     */
    private String name;

    /**
     * BGM播放地址
     */
    private String path;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取BGM作者名称
     *
     * @return author - BGM作者名称
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置BGM作者名称
     *
     * @param author BGM作者名称
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取BGM名称
     *
     * @return name - BGM名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置BGM名称
     *
     * @param name BGM名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取BGM播放地址
     *
     * @return path - BGM播放地址
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置BGM播放地址
     *
     * @param path BGM播放地址
     */
    public void setPath(String path) {
        this.path = path;
    }
}