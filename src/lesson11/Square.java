package lesson11;

public class Square {
    private double width;
    private double length;
    private static int count = 0;

    public Square(double width, double length) {
        this.width = width;
        this.length = length;
        count++;
    }

    public Square(double side) {
        this (side, side);
    }

    public Square () {
       this (1);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "%-10s - width: %.2f, length: %f ".formatted("Square",width, length);
    }
}
