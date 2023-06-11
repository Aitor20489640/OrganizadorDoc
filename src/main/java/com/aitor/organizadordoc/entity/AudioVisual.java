package com.aitor.organizadordoc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class AudioVisual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @NotNull
    @Column(name = "title")
    protected String title;
    @NotNull
    @Column(name = "duration")
    protected String duration;
    @Column(name = "url")
    protected String url;

    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}
