package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "search_records")
@Data
public class SearchRecords {
    @Id
    private String id;
    private String content;
}