package com.aitor.organizadordoc.service;

import com.aitor.organizadordoc.dto.UserDto;
import com.aitor.organizadordoc.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    void saveUser(UserDto userDto);

    Usuario findByUsername(String username);

    List<UserDto> findAllUsers();
}
