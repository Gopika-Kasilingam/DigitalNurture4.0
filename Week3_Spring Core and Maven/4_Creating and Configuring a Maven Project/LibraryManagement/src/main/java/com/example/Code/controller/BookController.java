package com.example.Code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public String getBook() {
        return "Book: Spring in Action";
    }
}
