package com.example.todo.repo;

import com.example.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface TodoRepo extends CrudRepository<Todo,Long> {


}
