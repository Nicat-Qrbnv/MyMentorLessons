package lesson8.exercise;

class Square {
    double length;
    double width;
    double area;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
        area = calculateArea();
    }

    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Square with area: " + area;
    }
}
