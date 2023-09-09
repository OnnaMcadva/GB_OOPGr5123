package org.example.Controllers;

import org.example.Domen.Person;
import org.example.Domen.Teacher;

import java.util.List;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    public static <T extends Person> double averageAge(List<T> persons)
    {
        return 0.0;
    }
}