package com.aitor.organizadordoc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    public void testGetterAndSetter() {
        Libro libro = new Libro();
        libro.setId(1L);
        libro.setTitle("Titulo");
        libro.setUrl("URL");
        libro.setIsPhysic(true);
        libro.setCurrentPage(1);
        libro.setMaxPages(10);

        Assertions.assertEquals(1L, libro.getId());
        Assertions.assertEquals("Titulo", libro.getTitle());
        Assertions.assertEquals("URL", libro.getUrl());
        Assertions.assertEquals(true, libro.getIsPhysic());
        Assertions.assertEquals(1, libro.getCurrentPage());
        Assertions.assertEquals(10, libro.getMaxPages());

    }

    @Test
    void testEquals() {
        Libro libro1 = new Libro();
        libro1.setId(1L);
        libro1.setTitle("Titulo");
        libro1.setUrl("URL");
        libro1.setIsPhysic(true);
        libro1.setCurrentPage(1);
        libro1.setMaxPages(10);

        Libro libro2 = new Libro();
        libro2.setId(1L);
        libro2.setTitle("Titulo");
        libro2.setUrl("URL");
        libro2.setIsPhysic(true);
        libro2.setCurrentPage(1);
        libro2.setMaxPages(10);

        Libro libro3 = new Libro();
        libro3.setId(2L);
        libro3.setTitle("Titulo 2");
        libro3.setUrl("URL 2");
        libro3.setIsPhysic(false);
        libro3.setCurrentPage(2);
        libro3.setMaxPages(20);

        Assertions.assertEquals(libro1, libro2);
        Assertions.assertNotEquals(libro1, libro3);
    }

    @Test
    void testHashCode() {
        Libro libro1 = new Libro();
        libro1.setId(1L);
        libro1.setTitle("Titulo");
        libro1.setUrl("URL");
        libro1.setIsPhysic(true);
        libro1.setCurrentPage(1);
        libro1.setMaxPages(10);

        Libro libro2 = new Libro();
        libro2.setId(1L);
        libro2.setTitle("Titulo");
        libro2.setUrl("URL");
        libro2.setIsPhysic(true);
        libro2.setCurrentPage(1);
        libro2.setMaxPages(10);

        Libro libro3 = new Libro();
        libro3.setId(2L);
        libro3.setTitle("Titulo 2");
        libro3.setUrl("URL 2");
        libro3.setIsPhysic(false);
        libro3.setCurrentPage(2);
        libro3.setMaxPages(20);

        Assertions.assertEquals(libro1.hashCode(), libro2.hashCode());
        Assertions.assertNotEquals(libro1.hashCode(), libro3.hashCode());
    }
}