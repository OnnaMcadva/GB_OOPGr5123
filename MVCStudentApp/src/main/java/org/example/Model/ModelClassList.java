package org.example.Model;

import java.util.List;

import org.example.Controller.Interfaces.iGetModel;
import org.example.Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}