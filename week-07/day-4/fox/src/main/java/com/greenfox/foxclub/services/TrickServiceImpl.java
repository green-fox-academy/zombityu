package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickServiceImpl implements TrickService {
  List<Trick> allTricks;


  public TrickServiceImpl() {
    allTricks = new ArrayList<>();
    allTricks.add(new Trick("write clean code"));
    allTricks.add(new Trick("runnig"));
    allTricks.add(new Trick("playing ball"));
    allTricks.add(new Trick("dancing"));
    allTricks.add(new Trick("do nothing"));
  }

  @Override
  public List<Trick> allTricks() {
    return allTricks;
  }


  @Override
  public List<Trick> availableTricks(List<Trick> alreadyKnownTricks,List<Trick> all){
    List<Trick> leftTricks = new ArrayList<>();
    for (Trick t:allTricks()) {
      if (alreadyKnownTricks.contains(t)){
        leftTricks.add(t);
      }
    }

    return leftTricks;
  }
}
