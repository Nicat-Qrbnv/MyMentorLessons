package lesson15.exercise;

public class Main {

    public static void main(String[] args) {
        Bird sparrow = new Bird("Sparrow");

        System.out.println("Bird name: " + sparrow.getName());
        sparrow.makeSound();

        flying(sparrow);

        Plane boeing747 = new Plane(400);

        boeing747.setDestination("New York");
        System.out.println("Plane capacity: " + boeing747.getCapacity());
        System.out.println("Plane destination: " + boeing747.getDestination());

        flying(boeing747);


        Flyable[] flyables = new Flyable[10];
        flyables[0] = boeing747;
    }

    static void flying (Flyable f) {
        f.land();
        f.takeOff();
    }
}
