package ru.gos1984.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gos1984.library.dao.DAO;

@Controller
public class AppController {

    private DAO authorDAO;
    private DAO genreDAO;
    private DAO publisherDAO;

    @Autowired
    @Qualifier("authorDAOImpl")
    public void setAuthor(DAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Autowired
    @Qualifier("genreDAOImpl")
    public void setGenre(DAO genreDAO) {this.genreDAO = genreDAO; }

    @Autowired
    @Qualifier("publisherDAOImpl")
    public void setPublisherDAO(DAO publisherDAO) {this.publisherDAO = publisherDAO; }

    @GetMapping("/authors")
    @Transactional
    public String authors(Model model) {
        model.addAttribute("results", authorDAO.getAll());
        return "list";
    }

    @GetMapping("/genres")
    @Transactional
    public String genres(Model model) {
        model.addAttribute("results", genreDAO.getAll());
        return "list";
    }

    @GetMapping("/publishers")
    @Transactional
    public String publishers(Model model) {
        model.addAttribute("results", publisherDAO.getAll());
        return "list";
    }

}
