package com.aitor.organizadordoc.web;

import com.aitor.organizadordoc.entity.AudioLibro;
import com.aitor.organizadordoc.entity.Libro;
import com.aitor.organizadordoc.repository.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

@Controller
public class DtoController {
    Logger logger = LoggerFactory.getLogger(DtoController.class);
    @Autowired
    AudioLibroRepository audioLibroRepository;
    @Autowired
    LibroRepository libroRepository;
    @Autowired
    PeliculaRepository peliculaRepository;
    @Autowired
    SerieRepository serieRepository;
    @Autowired
    VideoRepository videoRepository;

    @GetMapping("/dashboard")
    public String getAllItems(Model model) {
        List<Object> objects = new ArrayList<>();

        List<Libro> libros = libroRepository.findAll();
        List<AudioLibro> audioLibros = audioLibroRepository.findAll();

        objects.addAll(libros);
        objects.addAll(audioLibros);
        model.addAttribute("objetos", objects);
        return "dashboard";
    }

    @PostMapping("/api/nuevo/libro")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro returnedLibro = null;
        try {
            returnedLibro = libroRepository.save(libro);
        } catch (Exception e){
            logger.error("No se pudo guardar el libro " + e.getMessage());
        }

        if (returnedLibro != null) {
            return new ResponseEntity<>(returnedLibro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(returnedLibro, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/api/nuevo/audio-libro")
    public ResponseEntity<AudioLibro> crearLibro(@RequestBody AudioLibro audioLibro) {
        AudioLibro returnedAudioLibro = null;
        try {
            returnedAudioLibro = audioLibroRepository.save(audioLibro);
        } catch (Exception e){
            logger.error("No se pudo guardar el audio-libro " + e.getMessage());
        }

        if (returnedAudioLibro != null) {
            return new ResponseEntity<>(returnedAudioLibro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(returnedAudioLibro, HttpStatus.BAD_REQUEST);
        }
    }
}
