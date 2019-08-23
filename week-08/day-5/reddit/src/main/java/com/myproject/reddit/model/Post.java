package com.myproject.reddit.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private Integer rate;
  private String title;
  private String url;
  @Temporal(TemporalType.TIMESTAMP)
  private Date startTime;


  public Post() {
    this.rate = 0;
  }


  public Post(String title, String url) {
    this.rate = 0;
    this.title = title;
    this.url = url;
  }

  public Post(String title, String url, Date startTime) {
    this.rate = 0;
    this.title = title;
    this.url = url;
    this.startTime = startTime;
  }

  public Integer getId() {
    return id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }
}
