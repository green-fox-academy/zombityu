package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food = "nothing";
  private String drink = "nothing";
  List<Trick> tricks = new ArrayList<>();


  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void learnTricks(String trick){
    tricks.add(new Trick(trick));
  }
}
