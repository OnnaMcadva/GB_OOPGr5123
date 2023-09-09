package org.example;

public class Student<T extends Comparable<T>,V> extends Person<T,V> implements Comparable<Student<T,V>> {

    private V id;
    private V generalId;

    public Student(T name, V age) {
        super(name, age);
        this.id = generalId;
        //generalId=generalId+1;
    }


    public V getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Студент: " + super.getName() + ", возраст " + super.getAge() + ", id: " + id;
    }

    @Override
    public int compareTo(Student<T,V> o) {

        return super.getName().compareTo(o.getName());

        // System.out.println(super.getName()+" - "+o.getName());
        // if(super.getAge()==o.getAge())
        // {
        //     if(id==o.id)return 0 ;
        //     if(id>o.id)return 1;
        //     else return -1;
        //     //return 0;
        // }

        // if(super.getAge()>o.getAge())
        // return 1;
        // else
        // return -1;
    }
}