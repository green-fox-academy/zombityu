package com.greenfox.simba.models;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private boolean isItKing;
  private String goodOrBad;


  public BankAccount(String name, double balance, String animalType,boolean isItKing,String goodOrBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isItKing = isItKing;
    this.goodOrBad = goodOrBad;
  }

  public String getGoodOrBad() {
    return goodOrBad;
  }

  public void setGoodOrBad(String goodOrBad) {
    this.goodOrBad = goodOrBad;
  }

  public boolean isItKing() {
    return isItKing;
  }

  public void setItKing(boolean itKing) {
    isItKing = itKing;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }


}
