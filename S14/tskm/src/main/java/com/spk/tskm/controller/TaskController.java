package com.spk.tskm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spk.tskm.dao.TaskRepository;
import com.spk.tskm.model.Task;

import org.springframework.ui.Model;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", repository.findAll());
        model.addAttribute("newTask", new Task());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        repository.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        Task task = repository.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        repository.save(task);
        return "redirect:/";
    }
}