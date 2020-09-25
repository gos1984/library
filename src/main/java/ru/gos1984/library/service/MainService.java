package ru.gos1984.library.service;

import java.util.List;

public interface MainService<T> {

    public T get(Long id);

    public List<T> getAll();

    public T update(T t);

    public void delete(T t);

    public List<T> search(String search);

}
