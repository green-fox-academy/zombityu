package com.greenfox.demo.models;

public class Number {

  private int until;

  public Number() {
  }

  public Number(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return "until=" + until;
  }
}
