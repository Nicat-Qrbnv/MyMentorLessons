package lesson14;

public class Calc2 extends Calculator{

    public double sum(int a, int b, boolean pow) {
        if (pow) {
            return Math.pow(a, b);
        } else {
            return super.sum(a, b);
        }
    }
}
