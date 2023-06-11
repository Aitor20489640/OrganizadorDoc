package com.aitor.organizadordoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Serie")
public class Serie extends AudioVisual{
    @NotNull
    @Column(name = "currentChapter")
    private Integer currentChapter;
    @Column(name = "maxChapter")
    private Integer maxChapter;
    @NotNull
    @Column(name = "currentSeason")
    private Integer currentSeason;
    @Column(name = "maxSeasons")
    private Integer maxSeasons;
}
