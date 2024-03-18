package lesson9.homework;

// Drink class
class Ichki {
    private String name;
    private double price;

    public Ichki(String name) {
        this.name = name;
        this.price = switch (name.toLowerCase()) {
            default -> 20;
            case "su" -> 1;
            case "şirə" -> 3;
        };
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method
    @Override
    public String toString() {
        return name + " - " + price + " AZN";
    }
}
