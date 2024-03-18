package lesson15;

public class Dog implements Animal {
    private String type;
    private String color;
    private double weight;

    public Dog(String type, double weight, String color) {
        this.color = color;
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Dog is barking");
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

    @Override
    public void die() {
        System.out.println("Died");
    }
}
