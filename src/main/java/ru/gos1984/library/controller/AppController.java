package ru.gos1984.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gos1984.library.service.MainService;

@Controller
public class AppController {

    private MainService authorService;
    private MainService genreService;
    private MainService publisherService;

    @Autowired
    @Qualifier("authorServiceImpl")
    public void setAuthorService(MainService authorService) {
        this.authorService = authorService;
    }

    @Autowired
    @Qualifier("genreServiceImpl")
    public void setGenreService(MainService genreService) {
        this.genreService = genreService;
    }

    @Autowired
    @Qualifier("publisherServiceImpl")
    public void setPublisherService(MainService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/authors")
    public String authors(Model model) {
        model.addAttribute("results", authorService.getAll());
        return "list";
    }

    @GetMapping("/genres")
    public String genres(Model model) {
        model.addAttribute("results", genreService.getAll());
        return "list";
    }

    @GetMapping("/publishers")
    public String publishers(Model model) {
        model.addAttribute("results", publisherService.getAll());
        return "list";
    }

}
