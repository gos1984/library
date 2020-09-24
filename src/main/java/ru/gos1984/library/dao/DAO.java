package ru.gos1984.library.dao;


import java.util.List;

public interface DAO<T> {

    public T get(Long id);
    public List<T> getAll();
    public T update();
    public void delete();

}
