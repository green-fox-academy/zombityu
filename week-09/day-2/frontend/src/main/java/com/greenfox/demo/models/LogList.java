package com.greenfox.demo.models;

import java.util.List;

public class LogList {

  private List<Log> entries;
  private int entry_count;

  public LogList() {
  }

  public LogList(List<Log> entries) {
    this.entries = entries;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
