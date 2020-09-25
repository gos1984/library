package ru.gos1984.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gos1984.library.dao.DAO;
import ru.gos1984.library.entity.Genre;

import java.util.List;

@Service
public class GenreServiceImpl implements MainService<Genre> {

    private DAO<Genre> genreDAO;

    @Autowired
    public void setGenreDAO(DAO<Genre> genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Override
    @Transactional
    public Genre get(Long id) {
        return genreDAO.get(id);
    }

    @Override
    @Transactional
    public List<Genre> getAll() {
        return genreDAO.getAll();
    }

    @Override
    @Transactional
    public Genre update(Genre genre) {
        return genreDAO.update(genre);
    }

    @Override
    @Transactional
    public void delete(Genre genre) {
        genreDAO.delete(genre);
    }

    @Override
    @Transactional
    public List<Genre> search(String search) {
        return null;
    }
}
