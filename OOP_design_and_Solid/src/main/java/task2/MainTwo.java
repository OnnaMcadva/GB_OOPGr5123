package task2;
public class MainTwo {

    public static void main(String[] args) {

        Vehicle car1 = new Car(125,"Car");
        Vehicle bus1 = new Bus(90,"bus");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println("Allowed speed - " + speedCalculation.calculateAllowedSpeed(car1));
        System.out.println();
        System.out.println("Allowed speed - " + speedCalculation.calculateAllowedSpeed(bus1));
    }
}
