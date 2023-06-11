package com.aitor.organizadordoc.web;

import com.aitor.organizadordoc.entity.AudioLibro;
import com.aitor.organizadordoc.entity.Libro;
import com.aitor.organizadordoc.repository.AudioLibroRepository;
import com.aitor.organizadordoc.repository.LibroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DtoControllerTest {

    @Mock
    private AudioLibroRepository audioLibroRepository;
    @Mock
    private LibroRepository libroRepository;
    @Mock
    private Model model;

    @InjectMocks
    private DtoController dtoController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllItems() {
        // Arrange
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro());

        List<AudioLibro> audioLibros = new ArrayList<>();
        audioLibros.add(new AudioLibro());

        when(libroRepository.findAll()).thenReturn(libros);
        when(audioLibroRepository.findAll()).thenReturn(audioLibros);

        // Act
        String result = dtoController.getAllItems(model);

        // Assert
        assertEquals("dashboard", result);
        verify(model).addAttribute(eq("objetos"), anyList());
        verify(libroRepository).findAll();
        verify(audioLibroRepository).findAll();
    }
}
