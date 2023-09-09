package org.example.Domain;

public class HotDrink extends Product {

    private int temperature;
    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "; температура = " + temperature + " град.";
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
