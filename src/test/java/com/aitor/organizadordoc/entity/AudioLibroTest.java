package com.aitor.organizadordoc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioLibroTest {

    @Test
    public void testGetterAndSetter() {
        AudioLibro audioLibro = new AudioLibro();
        audioLibro.setId(1L);
        audioLibro.setTitle("Titulo");
        audioLibro.setUrl("URL");
        audioLibro.setDuration("1h 40m");
        audioLibro.setCurrentPage(1);
        audioLibro.setMaxPages(10);
        audioLibro.setNarratedBy("ME");

        Assertions.assertEquals(1L, audioLibro.getId());
        Assertions.assertEquals("Titulo", audioLibro.getTitle());
        Assertions.assertEquals("URL", audioLibro.getUrl());
        Assertions.assertEquals("1h 40m", audioLibro.getDuration());
        Assertions.assertEquals(1, audioLibro.getCurrentPage());
        Assertions.assertEquals(10, audioLibro.getMaxPages());
        Assertions.assertEquals("ME", audioLibro.getNarratedBy());

    }

    @Test
    void testEquals() {
        AudioLibro audioLibro1 = new AudioLibro();
        audioLibro1.setId(1L);
        audioLibro1.setTitle("Titulo");
        audioLibro1.setUrl("URL");
        audioLibro1.setDuration("1h 40m");
        audioLibro1.setCurrentPage(1);
        audioLibro1.setMaxPages(10);
        audioLibro1.setNarratedBy("ME");

        AudioLibro audioLibro2 = new AudioLibro();
        audioLibro2.setId(1L);
        audioLibro2.setTitle("Titulo");
        audioLibro2.setUrl("URL");
        audioLibro2.setDuration("1h 40m");
        audioLibro2.setCurrentPage(1);
        audioLibro2.setMaxPages(10);
        audioLibro2.setNarratedBy("ME");

        AudioLibro audioLibro3 = new AudioLibro();
        audioLibro3.setId(2L);
        audioLibro3.setTitle("Titulo 2");
        audioLibro3.setUrl("URL 2");
        audioLibro3.setDuration("1h 41m");
        audioLibro3.setCurrentPage(2);
        audioLibro3.setMaxPages(20);
        audioLibro3.setNarratedBy("You");

        Assertions.assertEquals(audioLibro1, audioLibro2);
        Assertions.assertNotEquals(audioLibro1, audioLibro3);
    }

    @Test
    void testHashCode() {
        AudioLibro audioLibro1 = new AudioLibro();
        audioLibro1.setId(1L);
        audioLibro1.setTitle("Titulo");
        audioLibro1.setUrl("URL");
        audioLibro1.setDuration("1h 40m");
        audioLibro1.setCurrentPage(1);
        audioLibro1.setMaxPages(10);
        audioLibro1.setNarratedBy("ME");

        AudioLibro audioLibro2 = new AudioLibro();
        audioLibro2.setId(1L);
        audioLibro2.setTitle("Titulo");
        audioLibro2.setUrl("URL");
        audioLibro2.setDuration("1h 40m");
        audioLibro2.setCurrentPage(1);
        audioLibro2.setMaxPages(10);
        audioLibro2.setNarratedBy("ME");

        AudioLibro audioLibro3 = new AudioLibro();
        audioLibro3.setId(2L);
        audioLibro3.setTitle("Titulo 2");
        audioLibro3.setUrl("URL 2");
        audioLibro3.setDuration("1h 41m");
        audioLibro3.setCurrentPage(2);
        audioLibro3.setMaxPages(20);
        audioLibro3.setNarratedBy("You");

        Assertions.assertEquals(audioLibro1.hashCode(), audioLibro2.hashCode());
        Assertions.assertNotEquals(audioLibro1.hashCode(), audioLibro3.hashCode());
    }
}