package com.aitor.organizadordoc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {

    @Test
    public void testGetterAndSetter() {
        Pelicula pelicula = new Pelicula();
        pelicula.setId(1L);
        pelicula.setTitle("Titulo");
        pelicula.setUrl("URL");
        pelicula.setDuration("1h 40m");
        pelicula.setCurrentMinute(1);


        Assertions.assertEquals(1L, pelicula.getId());
        Assertions.assertEquals("Titulo", pelicula.getTitle());
        Assertions.assertEquals("URL", pelicula.getUrl());
        Assertions.assertEquals("1h 40m", pelicula.getDuration());
        Assertions.assertEquals(1, pelicula.getCurrentMinute());
    }

    @Test
    void testEquals() {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setId(1L);
        pelicula1.setTitle("Titulo");
        pelicula1.setUrl("URL");
        pelicula1.setDuration("1h 40m");
        pelicula1.setCurrentMinute(1);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setId(1L);
        pelicula2.setTitle("Titulo");
        pelicula2.setUrl("URL");
        pelicula2.setDuration("1h 40m");
        pelicula2.setCurrentMinute(1);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setId(2L);
        pelicula3.setTitle("Titulo 2");
        pelicula3.setUrl("URL 2");
        pelicula3.setDuration("1h 41m");
        pelicula3.setCurrentMinute(2);

        Assertions.assertEquals(pelicula1, pelicula2);
        Assertions.assertNotEquals(pelicula1, pelicula3);
    }

    @Test
    void testHashCode() {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setId(1L);
        pelicula1.setTitle("Titulo");
        pelicula1.setUrl("URL");
        pelicula1.setDuration("1h 40m");
        pelicula1.setCurrentMinute(1);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setId(1L);
        pelicula2.setTitle("Titulo");
        pelicula2.setUrl("URL");
        pelicula2.setDuration("1h 40m");
        pelicula2.setCurrentMinute(1);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setId(2L);
        pelicula3.setTitle("Titulo 2");
        pelicula3.setUrl("URL 2");
        pelicula3.setDuration("1h 41m");
        pelicula3.setCurrentMinute(2);

        Assertions.assertEquals(pelicula1.hashCode(), pelicula2.hashCode());
        Assertions.assertNotEquals(pelicula1.hashCode(), pelicula3.hashCode());
    }
}