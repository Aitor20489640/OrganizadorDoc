package com.aitor.organizadordoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "AudioLibro")
public class AudioLibro extends AudioVisual{

    @Column(name = "narratedBy")
    private String narratedBy;
    @NotNull
    @Column(name = "currentPage")
    private Integer currentPage;
    @Column(name = "maxPages")
    private Integer maxPages;
}
