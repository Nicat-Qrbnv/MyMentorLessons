package lesson7;

public class Animal {
    String name;
    String color;
    int numberOfLegs;
    boolean canFly;

    public Animal (String name, String color, int numberOfLegs, boolean canFly) {
        this.name = name;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.canFly = canFly;
    }

    public Animal(String name, String color, boolean canFly) {
        this.name = name;
        this.color = color;
        this.canFly = canFly;
        numberOfLegs = 4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String eat (String food) {
        return name + " is eating " + food;
    }

    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", canFly=" + canFly +
                '}';
    }
}
