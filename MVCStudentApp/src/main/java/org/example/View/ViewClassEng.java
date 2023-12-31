package org.example.View;

import java.util.List;
import java.util.Scanner;

import org.example.Controller.Interfaces.iGetView;
import org.example.Model.Core.Student;

public class ViewClassEng implements iGetView {

    public void printAllStudent(List<Student> students)
    {
        System.out.println("----------- Students list -----------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}