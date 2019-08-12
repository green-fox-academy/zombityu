package com.greenfox.simba.controllers;

import com.greenfox.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class getHome {

  List<BankAccount> accounts = new ArrayList<>();

  public getHome() {
    accounts.add(new BankAccount("Simba",2000,"lion",true,"Good"));
    accounts.add(new BankAccount("Nala",1500,"lion",false,"Good"));
    accounts.add(new BankAccount("Pumba",1000,"pig",false,"Good"));
    accounts.add(new BankAccount("Zordon",5000,"evil lion",false,"Bad"));
  }

  @GetMapping("/show")
  public String getOneAccount(Model model){
    BankAccount firstAcc = new BankAccount("Simba",2000,"lion",false,"Good");
    model.addAttribute("firstAcc",firstAcc);
    return "index";
  }

  @GetMapping("/enjoy")
  public String getHtmlTag(){
    return "index";
  }

  @GetMapping("/accounts")
  public String getAccountList(Model model){
    model.addAttribute("accounts",accounts);
    return "accounts";
  }


}
