package org.example.Model.Core;

public class Student extends Person  {
    private int id;
    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Студент: " + super.getName() + ", возраст " + super.getAge() + ", id: " + id;
    }
}