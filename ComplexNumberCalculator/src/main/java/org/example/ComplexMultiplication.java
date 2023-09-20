package org.example;

public class ComplexMultiplication implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imag = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imag);
    }
}