package ru.gos1984.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gos1984.library.dao.DAO;
import ru.gos1984.library.entity.Author;

import java.util.List;

@Service
public class AuthorServiceImpl implements MainService<Author> {

    private DAO<Author> authorDAO;

    @Autowired
    public void setAuthorDAO(DAO<Author> authorDAO) {
        this.authorDAO = authorDAO;
    }


    @Override
    @Transactional
    public Author get(Long id) {
        return authorDAO.get(id);
    }

    @Override
    @Transactional
    public List<Author> getAll() {
        return authorDAO.getAll();
    }

    @Override
    @Transactional
    public Author update(Author author) {
        return authorDAO.update(author);
    }

    @Override
    @Transactional
    public void delete(Author author) {
        authorDAO.delete(author);
    }

    @Override
    @Transactional
    public List<Author> search(String search) {
        return null;
    }
}
