package org.example;

public class Main {
    public static void main(String[] args) {

        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexOperation addition = new ComplexAddition();
        ComplexOperation multiplication = new ComplexMultiplication();
        ComplexOperation division = new ComplexDivision();

        ComplexCalculator calculator = new ComplexCalculator(addition);
        ComplexNumber resultAdd = calculator.performOperation(num1, num2);
        System.out.println("Сложение: " + resultAdd);

        calculator = new ComplexCalculator(multiplication);
        ComplexNumber resultMultiply = calculator.performOperation(num1, num2);
        System.out.println("Умножение: " + resultMultiply);

        calculator = new ComplexCalculator(division);
        ComplexNumber resultDivide = calculator.performOperation(num1, num2);
        System.out.println("Деление: " + resultDivide);
    }
}