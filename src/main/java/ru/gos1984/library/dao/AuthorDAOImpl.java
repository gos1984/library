package ru.gos1984.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gos1984.library.entity.Author;

import java.util.List;

@Repository
public class AuthorDAOImpl implements DAO<Author> {


    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Author get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Author> query = session.createQuery("from Author where id = " + id, Author.class);
        return query.getSingleResult();
    }

    @Override
    public List<Author> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Author> query = session.createQuery("from Author", Author.class);
        System.out.println(query.getResultList());
        return query.getResultList();
    }

    @Override
    public Author update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
