package com.example.todomysql.services;

import com.example.todomysql.models.Todo;

import java.time.LocalDate;
import java.util.List;

public interface TodoService {

  List<Todo> allTodos();
  Todo saveTodos(Todo todo);
  void deleteTodos(long id);
  Todo findTodosByid(long id);
  List<Todo> searchTodos(String search);
  List<Todo> findDone(boolean isActive);

}
