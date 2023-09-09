package org.example.Controllers;

import org.example.Domain.Person;
import org.example.Domain.Teacher;
import org.example.Domain.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class AccountController {

    public static <T extends Teacher, Employee> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачена зарплата " + salary + "р.");
    }

    public static <T extends Person> double averageAge(List<T> persons)
    {
        return persons.stream()
                .collect(Collectors.averagingDouble(Person::getAge));
    }
}