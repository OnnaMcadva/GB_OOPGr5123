package org.example.Controller.Interfaces;

import java.util.List;

import org.example.Model.Core.Student;

public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String msg);
}