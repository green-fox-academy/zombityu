package com.example.todomysql;

import com.example.todomysql.models.Todo;
import com.example.todomysql.repository.TodoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication {



  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }


}
