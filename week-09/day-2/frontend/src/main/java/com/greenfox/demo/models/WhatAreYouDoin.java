package com.greenfox.demo.models;

public class WhatAreYouDoin {

  private String what;
  private int [] numbers = new int [4];

  public WhatAreYouDoin() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
