package com.aitor.organizadordoc.repository;

import com.aitor.organizadordoc.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
