package com.greenfox.demo.models;

public class DoublingNumber {

  private int received;
  private int result;

  public DoublingNumber() {
  }

  public DoublingNumber(int received) {
    this.received = received;
    this.result = received*2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
