package com.company.service;

public interface CRUD<T> {
    Long add();
    void delete (long id);
    T update(long id);
    T show();
}
