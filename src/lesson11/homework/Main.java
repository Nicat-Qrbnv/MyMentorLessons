package lesson11.homework;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Kawasaki","Red", 2);
        Bike bike2 = new Bike("Yamaha","Blue");

        System.out.println(bike1);
        System.out.println(bike2);

        Bike.printTotalBikesProduced();
    }
}
