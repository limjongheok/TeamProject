package com.example.teamproject.controller;

@Controller
public class IndexController {

    @GetMapping
    public @ResponseBody String index() {
        return "Hellow world";
    }

}
