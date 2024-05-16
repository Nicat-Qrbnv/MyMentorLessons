package lesson22;

public class Fruit {
    private String name;
    private double weight;
    private Color color;

    public Fruit(String name, double weight, Color color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return weight + " kg of " + color + " " + name;
    }
}
