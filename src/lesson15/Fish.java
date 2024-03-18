package lesson15;

public class Fish implements Animal{
    private double weight;
    private String type;

    public Fish(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    @Override
    public void makeNoise(String noise) {

    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void die() {

    }
}
