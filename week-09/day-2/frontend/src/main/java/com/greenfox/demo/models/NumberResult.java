package com.greenfox.demo.models;

public class NumberResult {

  private int  result;

  public NumberResult() {
  }

  public NumberResult(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum (int [] array){
    int sum = 0;
    for (int i = 0; i <array.length; i++) {
      sum+=array[i];
    }

    this.result = sum;
  }

  public void multiply(int [] array){
    int multiply = 1;
    for (int i = 1; i <array.length; i++) {
      multiply *= array[i];
    }

    this.result = multiply;
  }
}
