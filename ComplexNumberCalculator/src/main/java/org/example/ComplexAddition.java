package org.example;

/*
* Класс описывает сложение комплексных чисел.
* Реальные и мнимые части чисел складываются отедльно.
* Результаты сложения возвращаются.
*/
public class ComplexAddition implements ComplexOperation {

    /**
     * Переопределение метода
     * @param num1 певрое число
     * @param num2 второе число
     * @return возвращаются реальные и мнимые части результата сложения
     */
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {

        double real = num1.getReal() + num2.getReal();
        double imag = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imag);
    }
}