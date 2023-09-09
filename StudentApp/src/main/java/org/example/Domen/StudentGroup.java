package org.example.Domen;


import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup. " + "Группа № " + idGroup + ", количество студентов - " + group.size() + ": " + group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    /**
     * @apiNote Переопределение метода
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        // System.out.println(group.size() + " - " + o.group.size());
        if (group.size() == o.group.size())
        {
            if (getIdGroup() == o.getIdGroup())
                return 0;
            else if (getIdGroup() > o.getIdGroup())
                return 1;
            else
                return -1;
        }

        else if (group.size() > o.group.size())
            return 1;
        else
            return -1;
    }
    public static Comparator<StudentGroup> compareById() {
        return new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup o1, StudentGroup o2) {
                if (o1.getIdGroup() == o2.getIdGroup())
                    return 0;
                else if (o1.getIdGroup() > o2.getIdGroup())
                    return 1;
                else
                    return -1;
            }
        };

    }
}