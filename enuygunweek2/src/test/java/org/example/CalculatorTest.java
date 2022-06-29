package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void plus() {
        var operationPlus = new Calculator();
        double operationPlusResults = operationPlus.plus(5.15,7.15);
        System.out.println(operationPlusResults);
       assertEquals(12.30,operationPlusResults);
    }

    @Test
    void divide() {
        var operationDivide = new Calculator();
        double operationDivideResults = operationDivide.divide(25,4);
        System.out.println(operationDivideResults);
        assertEquals(6.25,operationDivideResults);
    }

    @Test
    void multiplication() {
        var operationMultiplication = new Calculator();
        double operationMultiplicationResults = operationMultiplication.multiplication(25.5,5);
        System.out.println(operationMultiplicationResults);
        assertEquals(127.5,operationMultiplicationResults);
    }

    @Test
    void subtraction() {
        var operationSubtraction = new Calculator();
        double operationSubtractionResults = operationSubtraction.subtraction(14.33,3.11);
        System.out.println(operationSubtractionResults);
        assertEquals(11.22,operationSubtractionResults);
    }
}