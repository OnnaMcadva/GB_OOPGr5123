package org.example.Domen;

import java.util.Iterator;
import java.util.List;
import org.example.Domen.StudentGroup;

/**
 * Класс StudentStream описывает поток групп студентов.
 * Поля класса лист групп студентов и номер потока.
 * Конструктор: создает лист групп студентов и номер потока.
 * Добавлены в класс геттер и сеттер для номера потока (с названием потока не разобралась пока).
 * Переопределен метод toString().
 */
public class StudentStream  {
    private List<StudentGroup> stream;
    private Integer idStream;

    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
        return "StudentStream. " + "Поток № " + idStream + ": " + stream;
    }

}