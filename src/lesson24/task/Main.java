package lesson24.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperMarket store = new SuperMarket();
        ArrayList<Product> products = new ArrayList<>(List.of (
                new Product(1, "Laptop", 1200.00, 50),
                new Product(2, "Smartphone", 800.00, 150),
                new Product(3, "Tablet", 300.00, 100),
                new Product(4, "Smartwatch", 200.00, 75),
                new Product(5, "Headphones", 100.00, 200),
                new Product(6, "Keyboard", 50.00, 250),
                new Product(7, "Mouse", 40.00, 100),
                new Product(8, "Monitor", 250.00, 80),
                new Product(9, "Printer", 150.00, 60),
                new Product(10, "Camera", 600.00, 40),
                new Product(11, "Speaker", 120.00, 110),
                new Product(12, "External Hard Drive", 80.00, 130),
                new Product(13, "USB Flash Drive", 20.00, 500),
                new Product(14, "Router", 70.00, 90),
                new Product(15, "Webcam", 60.00, 140)
        ));

        products.forEach(store::addProduct);

        Customer c1 = new Customer("Amil", 100_000);

        c1.doShoppingIn(store);
    }
}
