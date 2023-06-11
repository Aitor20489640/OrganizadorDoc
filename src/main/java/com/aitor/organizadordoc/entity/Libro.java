package com.aitor.organizadordoc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @Column(name = "currentPage")
    private Integer currentPage;
    @Column(name = "maxPages")
    private Integer maxPages;
    @NotNull
    @Column(name = "isPhysic")
    private Boolean isPhysic;
    @Column(name = "url")
    private String url;

    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}
