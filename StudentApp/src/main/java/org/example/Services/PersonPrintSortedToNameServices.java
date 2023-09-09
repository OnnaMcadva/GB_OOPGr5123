package org.example.Services;

import org.example.Domain.Person;
import org.example.Domain.PersonComparator;

import java.util.List;

public class PersonPrintSortedToNameServices {

    public <T extends Person> void print (List <T> persons){
        PersonComparator<T> personComparator = new PersonComparator<>();
        persons.stream()
                .sorted(personComparator)
                .forEach(System.out::println);
    }
}