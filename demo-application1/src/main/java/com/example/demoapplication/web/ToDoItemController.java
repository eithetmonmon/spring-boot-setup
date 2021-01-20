package com.example.demoapplication.web;

import com.example.demoapplication.dao.ToDoItemDao;
import com.example.demoapplication.ds.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoItemController {
    @Autowired
    private ToDoItemDao toDoItemDao;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("todoItems",toDoItemDao.findAll());
        model.addAttribute("newtodoItem", new ToDoItem());
        return "index1";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute ToDoItem toDoItem){
        toDoItemDao.save(toDoItem);
        return "redirect:/";
    }
}
