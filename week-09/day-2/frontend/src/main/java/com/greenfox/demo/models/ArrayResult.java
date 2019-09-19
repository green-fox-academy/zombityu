package com.greenfox.demo.models;

public class ArrayResult {

  private int [] result = {};

  public ArrayResult() {
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public void arrayDouble (int [] array){
    int [] newArray =new int [array.length];
    for (int i = 0; i <array.length; i++) {
      newArray[i] = array[i]*2;
    }

    this.result = newArray;
  }
}
