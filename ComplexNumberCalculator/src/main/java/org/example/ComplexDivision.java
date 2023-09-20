package org.example;

public class ComplexDivision implements ComplexOperation {
    /**
     * Переопределение метода
     * @param num1 певрое число
     * @param num2 второе число
     * @return возвращаются реальные и мнимые части результата сложения
     */
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imag = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imag);
    }
}
