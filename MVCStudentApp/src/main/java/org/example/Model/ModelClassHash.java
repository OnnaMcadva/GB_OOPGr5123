package org.example.Model;

import org.example.Controller.Interfaces.iGetModel;
import org.example.Model.Core.Student;

import java.util.HashMap;
import java.util.List;


public class ModelClassHash implements iGetModel {
    private HashMap<Long, Student> studentHashMap;

    public void ModelClassMap(HashMap<Long, Student> studentHashMap) {
        this.studentHashMap = studentHashMap;

    }

    public HashMap<Long, Student> getStudentHashMap() {
        return studentHashMap;
    }


    @Override
    public List<Student> getStudents() {
        return null;
    }
}
