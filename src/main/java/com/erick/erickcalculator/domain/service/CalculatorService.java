package com.erick.erickcalculator.domain.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String sum(int number1, int number2) {
        return Integer.toString(number1 + number2);
    }

    public String subtraction(int number1, int number2) {
        return Integer.toString(number1 - number2);
    }

    public String multiplication(int number1, int number2) {
        return Double.toString(number1 * number2);
    }

    public String division(int number1, int number2) {
        return Double.toString(number1 / number2);
    }
}//Fin de class CalculatorService
