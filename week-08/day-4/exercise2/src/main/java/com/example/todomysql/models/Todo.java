package com.example.todomysql.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @Temporal(TemporalType.DATE)
  private Date created;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate expire;

  @ManyToOne
  Assignee assignee;

  public Todo() {
    created = new Date();
  }

  public Todo(String title, boolean urgent, boolean done,LocalDate expire) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    this.expire = expire;
    created = new Date();

  }

  public LocalDate getExpire() {
    return expire;
  }

  public void setExpire(LocalDate expire) {
    this.expire = expire;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }


  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}

