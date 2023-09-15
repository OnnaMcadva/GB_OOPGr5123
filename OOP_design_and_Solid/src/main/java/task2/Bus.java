package task2;

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed() {
        return (maxSpeed * 0.6);
    }
}
