package com.aitor.organizadordoc.entity;

import lombok.Data;

@Data
public class Serie extends AudioVisual{
    private Integer currentChapter;
    private Integer maxChapter;
    private Integer currentSeason;
    private Integer maxSeasons;
}
