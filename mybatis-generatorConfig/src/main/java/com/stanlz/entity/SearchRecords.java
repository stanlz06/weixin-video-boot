package com.stanlz.entity;

import javax.persistence.*;

@Table(name = "search_records")
public class SearchRecords {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 搜索的内容
     */
    private String content;

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
     * 获取搜索的内容
     *
     * @return content - 搜索的内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置搜索的内容
     *
     * @param content 搜索的内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}