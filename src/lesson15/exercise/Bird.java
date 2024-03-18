package lesson15.exercise;

public class Bird implements Animal, Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chirps!");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " is taking off!");
    }

    @Override
    public void land() {
        System.out.println(name + " has landed!");
    }
}

