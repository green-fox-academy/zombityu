package com.webshop.webshop.controllers;


import com.webshop.webshop.models.ItemList;
import com.webshop.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class ShopItemListController {
  ItemList itemList = new ItemList();
  ShopItem item = new ShopItem("Running Shoes","Nike running shoes for every day sport",1000.0,5);
  ShopItem item2 = new ShopItem("Printer","Some HP printer that will print pages", 3000.0,2);
  ShopItem item3 = new ShopItem("Coca cola", "0.5 standard coke",25.0,0);
  ShopItem item4 = new ShopItem("Wokin","Chicken with fried rice and Wokin sauce",119.0,100);
  ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0,1);

  public void addItemsToList(){
    itemList.fillTheList(item);
    itemList.fillTheList(item2);
    itemList.fillTheList(item3);
    itemList.fillTheList(item4);
    itemList.fillTheList(item5);


  }

  @RequestMapping("/home")
  public String getHomeWithTable(Model model){
    itemList.flush();
    addItemsToList();
    model.addAttribute("items",itemList.getItemsList());
    return "index";
  }

  @RequestMapping("/only-available")
  public String getOnlyAvailable(Model model){
    List<ShopItem> only = itemList.getItemsList().stream()
            .filter(item -> item.getQuantityOfStock() > 0)
            .collect(Collectors.toList());

    model.addAttribute("items",only);

    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String getSortedPrice(Model model){
    List<ShopItem> sortedList = itemList.getItemsList().stream()
            .sorted(Comparator.comparing(item -> item.getPrice()))
            .collect(Collectors.toList());

    model.addAttribute("items",sortedList);

    return "index";
  }



}
