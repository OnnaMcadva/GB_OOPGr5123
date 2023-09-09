package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.Domen.Student;
import org.example.Domen.StudentGroup;
import org.example.Domen.StudentStream;

import org.example.Controllers.AccountController;
import org.example.Domen.PersonComparator;
import org.example.Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Артём", 25);
        Student s2 = new Student("Илья", 21);
        Student s3 = new Student("Сергей", 22);
        Student s4 = new Student("Онна",  26);
        Student s5 = new Student("Настя",  24);
        Student s6 = new Student("Катя",  23);
        Student s7 = new Student("Cartoon Head", 27);


        List<Student> listStud5123 = new ArrayList<Student>();
        listStud5123.add(s2);
        listStud5123.add(s3);
        List<Student> listStud5125 = new ArrayList<Student>();
        listStud5125.add(s4);
        listStud5125.add(s5);
        listStud5125.add(s6);
        listStud5125.add(s7);
        List<Student> listStud5127 = new ArrayList<Student>();
        listStud5127.add(s1);

        System.out.println();
        System.out.println("*           * Список групп *           *");
        System.out.println();

        StudentGroup group5123 = new StudentGroup(listStud5123, 5123);
        System.out.println(group5123);

        StudentGroup group5125 = new StudentGroup(listStud5125, 5125);
        System.out.println(group5125);

        StudentGroup group5127 = new StudentGroup(listStud5127, 5127);
        System.out.println(group5127);

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~ Список потока ~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group5123);
        listGroup1.add(group5125);
        listGroup1.add(group5127);

        StudentStream stream1 = new StudentStream(listGroup1, 1);
        System.out.println(stream1);

        System.out.println();
        System.out.println("-------------- Список потока по группам ------------------");
        System.out.println();

        printGroups(stream1);

        System.out.println();
        System.out.println("=============== Список студентов по группам ==================");
        System.out.println();

        printStudents(group5123);
        printStudents(group5125);
        printStudents(group5127);

        System.out.println();
        System.out.println("*************** Сортировка в группе по возрасту *****************");
        System.out.println();

        Collections.sort(group5125.getGroup());
        printStudents(group5125);

        System.out.println();
        System.out.println("*      * Сортировка в потоке по количеству студентов в группе *     *");
        System.out.println();

        Collections.sort(stream1.getStream());
        printGroups(stream1);

        System.out.println();
        System.out.println("*      * Сортировка в потоке по идентификатору группы *      *");
        System.out.println();

        Collections.sort(stream1.getStream(), StudentGroup.compareById());
        printGroups(stream1);

        System.out.println();
        System.out.println("*      * Сортировка в ??????????????ификатору группы *      *");
        System.out.println();

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);

        AccountController.paySalary(t1, 50000);

        System.out.println(AccountController.averageAge(listStud5123));

    }

    private static void printGroups(StudentStream stream) {
        System.out.println("Поток № " + stream.getIdStream());
        for(StudentGroup std: stream.getStream())
        {
            System.out.println(std);
        }
    }

    /**
     * @apiNote Метод выводит на печать номер группы и студентов группы, каждого с новой строки
     * @param group список студентов
     * @see org.example.Domen.StudentGroup
     */
    private static void printStudents(StudentGroup group) {
        System.out.println("Группа № " + group.getIdGroup());
        for(Student std : group)
        {
            System.out.println(std);
        }
    }
}