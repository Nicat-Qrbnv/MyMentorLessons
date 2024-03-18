package lesson9.homework;

// Side class
class Meze {
    private String name;
    private double price;

    public Meze(String name) {
        this.name = name;
        this.price = switch (name.toLowerCase()) {
            default -> 3;
            case "salad" -> 5;
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
