package task4;

public class MainFour {

    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(7,6);
        System.out.println(square.area());
        System.out.println(rectangle.area());
    }
}
