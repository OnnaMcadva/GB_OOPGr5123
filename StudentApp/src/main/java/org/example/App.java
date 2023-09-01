package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.Domen.Student;
import org.example.Domen.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Артём", 25);
        Student s2 = new Student("Илья", 23);
        Student s3 = new Student("Сергей", 22);
        Student s4 = new Student("Онна",  23);
        Student s5 = new Student("Настя",  24);
        Student s6 = new Student("Катя",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);


        StudentGroup group5123 = new StudentGroup(listStud, 5123);
        System.out.println(group5123);

        for(Student std : group5123)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group5123.getGroup());

        for(Student std: group5123.getGroup())
        {
            System.out.println(std);
        }
    }
}