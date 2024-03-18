package lesson9.homework;

class Kabab {
    private String name;
    private double price;

    public Kabab(String name) {
        this.name = name;
        price = switch (name.toLowerCase()) {
            default -> 40;
            case "lülə", "tikə" -> 6;
            case "xan", "antrikot" -> 10;
        };
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " kababı - " + price + " AZN";
    }
}
