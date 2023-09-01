package org.example.Classes;

/**
 * Класс ActionClient описывает акционного клиента. Класс наследуется от класса Actor.
 * Поля: название акции - статическое поле, id клиента - поле класса,
 * количество участников в акции - статическое поле.
 * Конструктор: создает акционного клиента с именем и id.
 * Основные методы наследуются из класс Actor.
 * Добавлены в класс геттер и сеттер для id: getIdClient() и setIdClient().
 * С методом isLucky() пока не могу разобраться.......
 * @see org.example.Classes.Actor
 */

public class ActionClient extends Actor {
    public static String nameOfAction;
    private int idClient;
    public static int numberOfParticipants;

    public ActionClient(String name, int id) {
        super(name);
        this.idClient = id;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public boolean isLucky(int idClient) {
    return this.idClient <= numberOfParticipants;
    }

}
