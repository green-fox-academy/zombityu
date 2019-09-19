package com.example.todomysql.services;

import com.example.todomysql.models.Assignee;

import java.util.List;

public interface AssigneeService {

  List<Assignee> allAssignees();
  Assignee saveAssignees(Assignee assignee);
  void deleteAssignees(int id);
  Assignee findAssignees(int id);

}
