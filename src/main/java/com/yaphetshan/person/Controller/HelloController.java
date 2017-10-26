package com.yaphetshan.person.Controller;


import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayGet(){
        System.out.println("A GET Request!");
                return "Hello World!";
      }

    @PostMapping(value = "/hello")
    public void sayPost(@RequestParam(value = "name",required = true) String name){
        System.out.println("A post Request From: "+name);

    }
}
