package org.example.Services;

import java.util.ArrayList;
import java.util.List;

import org.example.Domain.PersonComparator;
import org.example.Domain.Teacher;

public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String name, int age) {
        Teacher tchr = new Teacher(name, age, "basic");
        count++;
        teachers.add(tchr);
    }

    public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}