package com.example.GICalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

    @RequestMapping("/calculator")
    public String getCalculator(Model model){
        return "calculator";
    }
}
