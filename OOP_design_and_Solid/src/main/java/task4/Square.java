package task4;


public class Square implements Shape{
    int width;


    public Square(int width) {
        this.width = width;

    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public int area() {
        return width * width;
    }
}