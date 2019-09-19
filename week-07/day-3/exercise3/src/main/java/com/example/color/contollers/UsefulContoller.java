package com.example.color.contollers;

import com.example.color.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulContoller {

  @Autowired
  private UtilityService service;

  public UsefulContoller(UtilityService service) {
    this.service = service;
  }

  @GetMapping("/useful")
  public String getUseful(){
    return "index";
  }

  @GetMapping("/useful/colored")
  public String getColored(Model model){
    model.addAttribute("color",service.randomColor());
    return "index";
  }

  @GetMapping("/useful/email")
  public String getEmail(){
    return "email";
  }

  @PostMapping("/useful/email")
  public String emailValidat(Model model, @RequestParam(value = "email") String email){
    model.addAttribute("bool",service.IsEmailValid(email));
    model.addAttribute("email",email);
    return "email";
  }

  @GetMapping("/useful/caesar")
  public String getCoder(){
    return "privacy";
  }

  @PostMapping("/useful/caesar")
  public String encode(Model model, @RequestParam(value = "text")String text,
                                    @RequestParam(value = "number")int number){
    model.addAttribute("encode",
            "Encoded text: "+service.caesar(text,number));
    model.addAttribute("decode",
            "Decoded text: "+service.caesar(service.caesar(text,number),number*(-1)));

    return "privacy";
  }
}
