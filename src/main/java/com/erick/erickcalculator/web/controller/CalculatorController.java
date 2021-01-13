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
    public int sum(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return  calculatorService.sum(number1,number2);
        //return calculatorService.sum(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/subtraction")
    @ResponseBody
    public int subtraction(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return  calculatorService.subtraction(number1,number2);
  //      return calculatorService.subtraction(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/multiplication")
    @ResponseBody
    public int multiplication(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return  calculatorService.multiplication(number1,number2);
 //       return calculatorService.multiplication(Integer.valueOf(number1), Integer.valueOf(number2));
    }

    @GetMapping("/division")
    @ResponseBody
    public Double division(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
        return  calculatorService.division(number1,number2);
 //       return calculatorService.division(Integer.valueOf(number1), Integer.valueOf(number2));
    }
}//Fin de class CalculatorController
