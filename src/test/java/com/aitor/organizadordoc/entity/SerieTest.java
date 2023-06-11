package com.aitor.organizadordoc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    @Test
    public void testGetterAndSetter() {
        Serie serie = new Serie();
        serie.setId(1L);
        serie.setTitle("Titulo");
        serie.setUrl("URL");
        serie.setDuration("1h 40m");
        serie.setCurrentChapter(1);
        serie.setMaxChapter(10);
        serie.setCurrentSeason(1);
        serie.setMaxSeasons(10);

        Assertions.assertEquals(1L, serie.getId());
        Assertions.assertEquals("Titulo", serie.getTitle());
        Assertions.assertEquals("URL", serie.getUrl());
        Assertions.assertEquals("1h 40m", serie.getDuration());
        Assertions.assertEquals(1, serie.getCurrentChapter());
        Assertions.assertEquals(10, serie.getMaxChapter());
        Assertions.assertEquals(1, serie.getCurrentSeason());
        Assertions.assertEquals(10, serie.getMaxSeasons());

    }

    @Test
    void testEquals() {
        Serie serie1 = new Serie();
        serie1.setId(1L);
        serie1.setTitle("Titulo");
        serie1.setUrl("URL");
        serie1.setDuration("1h 40m");
        serie1.setCurrentChapter(1);
        serie1.setMaxChapter(10);
        serie1.setCurrentSeason(1);
        serie1.setMaxSeasons(10);

        Serie serie2 = new Serie();
        serie2.setId(1L);
        serie2.setTitle("Titulo");
        serie2.setUrl("URL");
        serie2.setDuration("1h 40m");
        serie2.setCurrentChapter(1);
        serie2.setMaxChapter(10);
        serie2.setCurrentSeason(1);
        serie2.setMaxSeasons(10);

        Serie serie3 = new Serie();
        serie3.setId(2L);
        serie3.setTitle("Titulo 2");
        serie3.setUrl("URL 2");
        serie3.setDuration("1h 41m");
        serie3.setCurrentChapter(2);
        serie3.setMaxChapter(20);
        serie3.setCurrentSeason(2);
        serie3.setMaxSeasons(20);

        Assertions.assertEquals(serie1, serie2);
        Assertions.assertNotEquals(serie1, serie3);
    }

    @Test
    void testHashCode() {
        Serie serie1 = new Serie();
        serie1.setId(1L);
        serie1.setTitle("Titulo");
        serie1.setUrl("URL");
        serie1.setDuration("1h 40m");
        serie1.setCurrentChapter(1);
        serie1.setMaxChapter(10);
        serie1.setCurrentSeason(1);
        serie1.setMaxSeasons(10);

        Serie serie2 = new Serie();
        serie2.setId(1L);
        serie2.setTitle("Titulo");
        serie2.setUrl("URL");
        serie2.setDuration("1h 40m");
        serie2.setCurrentChapter(1);
        serie2.setMaxChapter(10);
        serie2.setCurrentSeason(1);
        serie2.setMaxSeasons(10);

        Serie serie3 = new Serie();
        serie3.setId(2L);
        serie3.setTitle("Titulo 2");
        serie3.setUrl("URL 2");
        serie3.setDuration("1h 41m");
        serie3.setCurrentChapter(2);
        serie3.setMaxChapter(20);
        serie3.setCurrentSeason(2);
        serie3.setMaxSeasons(20);

        Assertions.assertEquals(serie1.hashCode(), serie2.hashCode());
        Assertions.assertNotEquals(serie1.hashCode(), serie3.hashCode());
    }

}