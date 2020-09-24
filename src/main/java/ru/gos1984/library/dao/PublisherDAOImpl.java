package ru.gos1984.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gos1984.library.entity.Publisher;

import java.util.List;

@Repository
public class PublisherDAOImpl implements DAO<Publisher>{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Publisher get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Publisher> query = session.createQuery("from Publisher where id=" + id, Publisher.class);
        return query.getSingleResult();
    }

    @Override
    public List<Publisher> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Publisher> query = session.createQuery("from Publisher", Publisher.class);
        return query.getResultList();
    }

    @Override
    public Publisher update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
