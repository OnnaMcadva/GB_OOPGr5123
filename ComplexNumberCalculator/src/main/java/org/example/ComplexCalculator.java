package org.example;

public class ComplexCalculator {
    private ComplexOperation operation;
    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }
    public ComplexNumber performOperation(ComplexNumber num1, ComplexNumber num2) {
        return operation.execute(num1, num2);
    }
}