package org.example.Domain;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "Преподаватель: " + super.getName() + ", возраст: " + super.getAge() + ", звание " + acadDegree;
    }
}