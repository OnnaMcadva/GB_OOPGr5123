package org.example;

public class ComplexDivision implements ComplexOperation {
    /**
     * Переопределение методов
     */
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imag = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imag);
    }
}
