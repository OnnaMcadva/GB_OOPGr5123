package task2;

public class Car extends Vehicle {


    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed() {
        return (maxSpeed * 0.8);
    }
}
