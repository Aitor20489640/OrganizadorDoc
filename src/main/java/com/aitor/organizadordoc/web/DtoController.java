package com.aitor.organizadordoc.web;

import com.aitor.organizadordoc.entity.AudioLibro;
import com.aitor.organizadordoc.entity.Libro;
import com.aitor.organizadordoc.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DtoController {
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

    @GetMapping("/nuevo/libro")
    public String crearLibro(Model model) {
        Libro libro = new Libro();

        model.addAttribute("libro", libro);

        return "nuevoLibro";
    }

    @PostMapping("/save/libro")
    public String guardarLibro(@ModelAttribute("libro") Libro libro) {

        libroRepository.save(libro);
        return "redirect:/dashboard";
    }

    @GetMapping("/nuevo/audio-libro")
    public String crearAudioLibro(Model model) {
        AudioLibro audioLibro = new AudioLibro();

        model.addAttribute("audioLibro", audioLibro);

        return "nuevoAudioLibro";
    }

    @PostMapping("/save/audioLibro")
    public String guardarAudioLibro(@ModelAttribute("audioLibro") AudioLibro audioLibro) {

        audioLibroRepository.save(audioLibro);
        return "redirect:/dashboard";
    }
}
