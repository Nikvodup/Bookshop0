package com.example.controllers;


import com.example.data.Book;
import com.example.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/bookshop")
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks(){
        return bookService.getBooksData();
    }

    @GetMapping("/main")
    public String mainPage(Model model){
        model.addAttribute("serverTime", new SimpleDateFormat("hh:mm:ss").format(new Date()));
        return "index";
    }
}
