package com.example.todo;

import com.example.todo.model.Todo;
import com.example.todo.repo.TodoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
  TodoRepo todoRepo;

  public TodoApplication(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }




  @Override
  public void run(String... args) throws Exception {
    todoRepo.save(new Todo("I have to learn Object Relational Mapping"));

  }
}
