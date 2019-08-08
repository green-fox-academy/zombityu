package com.webshop.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
  List<ShopItem> itemsList = new ArrayList<>();

  public void fillTheList(ShopItem items){
    itemsList.add(items);
  }

  public List<ShopItem> getItemsList() {
    return itemsList;
  }

  public void flush(){
    itemsList.clear();
  }
}
