package task1;

import java.util.Date;

public class MainOne {

    public static void main(String[] args) {
        Date date = new Date();
        Employee employee = new Employee("Tom",date, 80000);
        CalculateNetSalary calculateNetSalary = new CalculateNetSalary();
        System.out.println(calculateNetSalary.calculateNetSalary(employee));
    }
}