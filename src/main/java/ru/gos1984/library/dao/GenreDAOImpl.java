package ru.gos1984.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gos1984.library.entity.Genre;

import java.util.List;

@Repository
public class GenreDAOImpl implements DAO<Genre>{


    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Genre get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Genre> query = session.createQuery("from genre where id=" + id, Genre.class);
        return query.getSingleResult();
    }

    @Override
    public List<Genre> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Genre> query = session.createQuery("from Genre", Genre.class);
        return query.getResultList();
    }

    @Override
    public Genre update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
