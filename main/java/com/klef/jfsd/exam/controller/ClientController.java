package com.klef.jfsd.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ClientController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "test";
    }

    @RequestMapping("/test")
    public String test(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "calculate";
    }

    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "addNumbers";
    }

    @RequestMapping("/combine")
    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combine";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("multiplication", num1 * num2);
        return "calculate";
    }
    

}