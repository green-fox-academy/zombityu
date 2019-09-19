package com.greenfox.demo.models;

public class Result {

  private int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(int until){
    int sum = 0;

    for (int i = 1; i < until+1; i++) {
      sum += i;
    }

    this.result = sum;
  }

  public void factor(int until){
    int fact = 1;

    for (int i = 1; i < until+1; i++) {
      fact *= i;
    }

    this.result = fact;
  }
}
