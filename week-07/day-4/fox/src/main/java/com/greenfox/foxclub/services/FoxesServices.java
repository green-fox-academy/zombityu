package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxesServices {
  ArrayList<Fox> foxes;

  TrickService trickService;

  public FoxesServices( TrickService trickService) {
    foxes = new ArrayList<>();
    this.trickService = trickService;
  }

  public void setFox(String name) {
    foxes.add(new Fox(name));
  }

  public ArrayList<Fox> findAll() {
    return foxes;
  }

  public Fox getFox(ArrayList<Fox> foxes, String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }

    return null;
  }


}