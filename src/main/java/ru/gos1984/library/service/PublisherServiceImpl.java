package ru.gos1984.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gos1984.library.dao.DAO;
import ru.gos1984.library.entity.Publisher;

import java.util.List;

@Service
public class PublisherServiceImpl implements MainService<Publisher> {

    private DAO<Publisher> publisherDAO;

    @Autowired
    public void setPublisherDAO(DAO<Publisher> publisherDAO) {
        this.publisherDAO = publisherDAO;
    }

    @Override
    @Transactional
    public Publisher get(Long id) {
        return publisherDAO.get(id);
    }

    @Override
    @Transactional
    public List<Publisher> getAll() {
        return publisherDAO.getAll();
    }

    @Override
    @Transactional
    public Publisher update(Publisher publisher) {
        return publisherDAO.update(publisher);
    }

    @Override
    @Transactional
    public void delete(Publisher publisher) {
        publisherDAO.delete(publisher);
    }

    @Override
    @Transactional
    public List<Publisher> search(String search) {
        return null;
    }
}
