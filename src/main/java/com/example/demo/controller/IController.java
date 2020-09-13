package com.example.demo.controller;

public interface IController<T> {
	Object getAll();
    T getById(Long elementId);
    T save(T t);
    void delete(T t);
}
