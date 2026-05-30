package com.hstn.thyleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @GetMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();
        model.addAttribute("message", "Yo! " + studentName);
        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String letsShoutDude(@RequestParam String studentName, Model model) {
        studentName = studentName.toUpperCase();
        model.addAttribute("message", "Yo! " + studentName);
        return "helloworld";
    }


}
