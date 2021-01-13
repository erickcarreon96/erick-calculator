package com.erick.erickcalculator.web.controller;

import com.erick.erickcalculator.domain.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sum")
    @ResponseBody
    public String sum(@RequestParam("number1") String number1, @RequestParam("number2") String number2) {
        return calculatorService.sum(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/subtraction")
    @ResponseBody
    public String subtraction(@RequestParam("number1") String number1, @RequestParam("number2") String number2) {
        return calculatorService.subtraction(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/multiplication")
    @ResponseBody
    public String multiplication(@RequestParam("number1") String number1, @RequestParam("number2") String number2) {
        return calculatorService.multiplication(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/division")
    @ResponseBody
    public String division(@RequestParam("number1") String number1, @RequestParam("number2") String number2) {
        return calculatorService.division(Integer.valueOf(number1), Integer.valueOf(number2));
    }
}//Fin de class CalculatorController
