package com.aitor.organizadordoc.entity;

import lombok.Data;

@Data
public class Libro {
    private String title;
    private Integer currentPage;
    private Integer maxPages;
    private Boolean isPhysic;
    private String url;
}
