package org.example;

public class ComplexAddition implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double real = num1.getReal() + num2.getReal();
        double imag = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imag);
    }
}