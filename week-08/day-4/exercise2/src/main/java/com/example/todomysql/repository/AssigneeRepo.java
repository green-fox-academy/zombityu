package com.example.todomysql.repository;

import com.example.todomysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Integer> {

  List<Assignee> findAll();
  Assignee findById(int id);
  void deleteById(int id);
  Assignee findByName(String name);
}
