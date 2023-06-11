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
@Table(name = "Video")
public class Video extends AudioVisual{
    @NotNull
    @Column(name = "currentMinute")
    private Integer currentMinute;
}
