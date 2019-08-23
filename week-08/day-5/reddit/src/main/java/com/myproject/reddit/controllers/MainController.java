package com.myproject.reddit.controllers;

import com.myproject.reddit.model.Post;
import com.myproject.reddit.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class MainController {

  PostRepo postRepo;

  @Autowired
  public MainController(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  @GetMapping("/")
  public String renderPage(Model model){
    model.addAttribute("posts",postRepo.findAll());
    return "index";
  }

  @GetMapping("/submit")
  public String renderSubmitPage(){
    return "newPost";
  }

  @PostMapping("/submit")
  public String addNewPost(@RequestParam("title") String title,
                                 @RequestParam("url") String url){
    postRepo.save(new Post(title,url,new Date()));

    return "redirect:/";
  }


  @GetMapping(value = "{id}/plus")
    public String addPlusRate(@PathVariable String id){
    Post post =  postRepo.findById(Integer.parseInt(id));
    post.setRate(post.getRate()+1);
    postRepo.save(post);
    return "redirect:/";
  }

  @GetMapping(value = "{id}/minus")
  public String addMinusRate(@PathVariable String id){
    Post post =  postRepo.findById(Integer.parseInt(id));
    post.setRate(post.getRate()-1);
    postRepo.save(post);
    return "redirect:/";
  }

  @GetMapping("/login")
  public String renderLoginPage(){
    return "login";
  }



}
