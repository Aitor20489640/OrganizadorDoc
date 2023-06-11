package com.aitor.organizadordoc.web;

import com.aitor.organizadordoc.dto.UserDto;
import com.aitor.organizadordoc.entity.Usuario;
import com.aitor.organizadordoc.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UsersControllerTest {

    @Mock
    private UsuarioService usuarioService;
    @Mock
    private Model model;
    @Mock
    private BindingResult bindingResult;

    @InjectMocks
    private UsersController usersController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testShowRegistrationForm() {
        // Arrange
        UserDto userDto = new UserDto();

        // Act
        String result = usersController.showRegistrationForm(model);

        // Assert
        assertEquals("singin", result);
        verify(model).addAttribute(eq("user"), any(UserDto.class));
    }

    @Test
    void testRegistration_existingUser() {
        // Arrange
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setUsername("existingUser");

        Usuario existingUser = new Usuario();
        userDto.setId(1L);
        existingUser.setUsername("existingUser");

        when(usuarioService.findByUsername(userDto.getUsername())).thenReturn(existingUser);
        when(bindingResult.hasErrors()).thenReturn(true);
        // Act
        String result = usersController.registration(userDto, bindingResult, model);

        // Assert
        assertEquals("/singin", result);
        verify(bindingResult).rejectValue(eq("username"), any(), eq("There is already an account registered with the same username"));
        verify(model).addAttribute(eq("user"), eq(userDto));
        verify(usuarioService, never()).saveUser(any(UserDto.class));
    }

    @Test
    void testRegistration_validUser() {
        // Arrange
        UserDto userDto = new UserDto();
        userDto.setUsername("newUser");

        when(bindingResult.hasErrors()).thenReturn(false);

        // Act
        String result = usersController.registration(userDto, bindingResult, model);

        // Assert
        assertEquals("redirect:/login", result);
        verify(bindingResult, never()).rejectValue(any(), any(), any());
        verify(model, never()).addAttribute(any(), any());
        verify(usuarioService).saveUser(userDto);
    }

    @Test
    void testUsers() {
        // Arrange
        List<UserDto> users = new ArrayList<>();
        users.add(new UserDto());

        when(usuarioService.findAllUsers()).thenReturn(users);

        // Act
        String result = usersController.users(model);

        // Assert
        assertEquals("users", result);
        verify(model).addAttribute(eq("users"), eq(users));
    }
}
