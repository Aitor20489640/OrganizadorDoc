package com.aitor.organizadordoc.entity;

import lombok.Data;

@Data
public class AudioLibro extends AudioVisual{
    private String narratedBy;
    private Integer currentPage;
    private Integer maxPages;
}
