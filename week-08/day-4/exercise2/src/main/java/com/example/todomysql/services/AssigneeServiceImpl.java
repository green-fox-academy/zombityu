package com.example.todomysql.services;

import com.example.todomysql.models.Assignee;
import com.example.todomysql.repository.AssigneeRepo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  AssigneeRepo assigneeRepo;

  public AssigneeServiceImpl(AssigneeRepo assigneeRepo) {
    this.assigneeRepo = assigneeRepo;
  }

  @Override
  public List<Assignee> allAssignees() {
    return assigneeRepo.findAll();
  }

  @Override
  public Assignee saveAssignees(Assignee assignee) {
    return assigneeRepo.save(assignee);
  }

  @Override
  public void deleteAssignees(int id) {
    assigneeRepo.deleteById(id);
  }

  @Override
  public Assignee findAssignees(int id) {
    return assigneeRepo.findById(id);
  }


}
