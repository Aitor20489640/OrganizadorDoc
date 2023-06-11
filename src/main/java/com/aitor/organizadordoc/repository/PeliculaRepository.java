package com.aitor.organizadordoc.repository;


import com.aitor.organizadordoc.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
