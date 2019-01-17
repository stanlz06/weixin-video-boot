package com.stanlz.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Bgm {
    @Id
    private String id;
    private String author;
    private String name;
    private String path;
}