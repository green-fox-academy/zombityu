package com.example.todomysql.repository;

import com.example.todomysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoRepo extends CrudRepository<Todo,Long> {

    List<Todo> findAllByDone(boolean isActive);
    void deleteById(long id);
    Todo findById(long id);
}
