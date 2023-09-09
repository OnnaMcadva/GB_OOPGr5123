package org.example.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.example.Controller.Interfaces.iGetModel;
import org.example.Controller.Interfaces.iGetView;
import org.example.Model.ModelClassList;
import org.example.Model.Core.Student;
import org.example.View.ViewClass;
import org.example.Model.ModelClassHash;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();
    private HashMap<Long, Student> studentHashMap = new HashMap<>();


    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update() {

        //MVP
        students = model.getStudents();

        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }


        // MVC
        //view.printAllStudent(model.getStudents());
    }


    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    /* находится в стадии разработки:) */
                    break;
            }
        }
    }

}