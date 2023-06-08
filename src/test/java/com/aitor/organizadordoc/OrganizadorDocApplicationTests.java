package com.aitor.organizadordoc;

import com.aitor.organizadordoc.entity.Usuario;
import com.aitor.organizadordoc.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrganizadorDocApplicationTests {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Test
    void contextLoads() {
    }


}
