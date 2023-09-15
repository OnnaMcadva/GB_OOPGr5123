package task1;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;

    public int getBaseSalary() {
        return baseSalary;
    }

    private int baseSalary;


    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmplnfo() {
        return "name -" + name + ", dob -" + dob.toString();
    }

}
