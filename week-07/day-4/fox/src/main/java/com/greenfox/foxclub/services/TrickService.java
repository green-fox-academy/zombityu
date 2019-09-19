package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Trick;

import java.util.List;

public interface TrickService {
  List<Trick> allTricks();
  List<Trick> availableTricks(List<Trick> alreadyKnownTricks,List<Trick> all);

}
