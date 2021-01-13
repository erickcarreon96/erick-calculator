package com.erick.erickcalculator.domain.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(int number1, int number2) {
        return number1 + number2;
//        return Integer.toString(number1 + number2);
    }

    public int subtraction(int number1, int number2) {
        return number1 - number2;
//        return Integer.toString(number1 - number2);
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
//        return Double.toString(number1 * number2);
    }

    public Double division(double number1, double number2) {
        return number1 / number2;
//        return Double.toString(number1 / number2);
    }
}//Fin de class CalculatorService
