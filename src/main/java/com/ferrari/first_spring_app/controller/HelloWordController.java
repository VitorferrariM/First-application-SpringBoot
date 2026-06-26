package com.ferrari.first_spring_app.controller;


import com.ferrari.first_spring_app.domain.User;
import com.ferrari.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hello-Word")
public class HelloWordController {

     @Autowired
    private HelloWordService helloWordService;


    @GetMapping
   public String helloWord(){
       return helloWordService.HelloWord("Vitor");
    }





    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter" , defaultValue = "nenhum")String filter, @RequestBody User body) {

        return "hello Word" + filter;
    }




}
