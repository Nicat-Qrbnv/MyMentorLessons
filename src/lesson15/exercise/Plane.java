package lesson15.exercise;

public class Plane implements Transport, Flyable {
    private int capacity;
    private String destination;

    public Plane(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void setDestination(String destination, int number) {

    }

    @Override
    public void takeOff() {
        System.out.println("Plane is taking off!");
    }

    @Override
    public void land() {
        System.out.println("Plane has landed at " + destination);
    }
}

