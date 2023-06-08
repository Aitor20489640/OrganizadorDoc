package com.aitor.organizadordoc.repository;

import com.aitor.organizadordoc.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, String> {

    Usuario findByUsername(String username);

    Boolean existsByUsername(String username);
}
