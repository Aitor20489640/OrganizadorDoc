package com.aitor.organizadordoc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 20)
    private String name;

    @ManyToMany(mappedBy="roles")
    private List<Usuario> users;

    public Role() {}
}
