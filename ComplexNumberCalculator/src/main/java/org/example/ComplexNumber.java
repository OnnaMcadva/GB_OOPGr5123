package org.example;
/**
* Класс расскладывает число на реальную и мнимую части.
 * */
public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    /**
     * Переопределение метода
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
