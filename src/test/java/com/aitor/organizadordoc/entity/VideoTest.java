package com.aitor.organizadordoc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {

    @Test
    public void testGetterAndSetter() {
        Video video = new Video();
        video.setId(1L);
        video.setTitle("Titulo");
        video.setUrl("URL");
        video.setDuration("1h 40m");
        video.setCurrentMinute(1);


        Assertions.assertEquals(1L, video.getId());
        Assertions.assertEquals("Titulo", video.getTitle());
        Assertions.assertEquals("URL", video.getUrl());
        Assertions.assertEquals("1h 40m", video.getDuration());
        Assertions.assertEquals(1, video.getCurrentMinute());
    }

    @Test
    void testEquals() {
        Video video1 = new Video();
        video1.setId(1L);
        video1.setTitle("Titulo");
        video1.setUrl("URL");
        video1.setDuration("1h 40m");
        video1.setCurrentMinute(1);

        Video video2 = new Video();
        video2.setId(1L);
        video2.setTitle("Titulo");
        video2.setUrl("URL");
        video2.setDuration("1h 40m");
        video2.setCurrentMinute(1);

        Video video3 = new Video();
        video3.setId(2L);
        video3.setTitle("Titulo 2");
        video3.setUrl("URL 2");
        video3.setDuration("1h 41m");
        video3.setCurrentMinute(2);

        Assertions.assertEquals(video1, video2);
        Assertions.assertNotEquals(video1, video3);
    }

    @Test
    void testHashCode() {
        Video video1 = new Video();
        video1.setId(1L);
        video1.setTitle("Titulo");
        video1.setUrl("URL");
        video1.setDuration("1h 40m");
        video1.setCurrentMinute(1);

        Video video2 = new Video();
        video2.setId(1L);
        video2.setTitle("Titulo");
        video2.setUrl("URL");
        video2.setDuration("1h 40m");
        video2.setCurrentMinute(1);

        Video video3 = new Video();
        video3.setId(2L);
        video3.setTitle("Titulo 2");
        video3.setUrl("URL 2");
        video3.setDuration("1h 41m");
        video3.setCurrentMinute(2);

        Assertions.assertEquals(video1.hashCode(), video2.hashCode());
        Assertions.assertNotEquals(video1.hashCode(), video3.hashCode());
    }
}