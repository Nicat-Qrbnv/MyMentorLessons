package lesson11.homework;

public class Bike {
    private static int count = 0;
    private String name;
    private String color;
    private int numberOfWheels;

    public Bike(String name, String color, int numberOfWheels) {
        count++;
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public Bike(String name, String color) {
        this(name, color, 2);
    }

    public static void printTotalBikesProduced() {
        System.out.println("Total number of bikes produced: " + count);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

}

