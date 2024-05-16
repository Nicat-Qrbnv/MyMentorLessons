package lesson24.task;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private double budget;
    private final List<Product> basket = new ArrayList<>();

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void doShoppingIn(SuperMarket store) {
        List<Product> stock = store.getProducts().stream().toList();
        for (Product prod : stock) {
            if (budget > 0) {
                double cost = prod.getAmount() * prod.getPrice();
                if (cost <= budget) {
                    store.removeProduct(prod.getProductId(), prod.getAmount());
                    basket.add(prod);
                    budget -= cost;
                } else {
                    break;
                }
            }
        }
        basket.forEach (System.out::println);
        System.out.println();
        System.out.println(store.getProducts());
    }

    @Override
    public String toString() {
        return name + "'s budget=" + budget + "\n products= " + basket;
    }
}
