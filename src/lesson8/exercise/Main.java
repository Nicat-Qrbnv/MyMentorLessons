package lesson8.exercise;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        for (int i = 0; i < squares.length; i++) {

            double length = Math.random()*10 + 1;
            double width = Math.random()*10 + 1;

            squares[i] = new Square(length, width);
        }

        for (Square s: squares) {
            System.out.println(s);
        }
    }
}