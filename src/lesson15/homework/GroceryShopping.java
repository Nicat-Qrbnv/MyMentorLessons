package lesson15.homework;

import java.util.Arrays;

public class GroceryShopping {
    private Product[] shoppingList;

    public GroceryShopping() {
        shoppingList = new Product[0];
    }

    public void addProduct(Product product) {
        shoppingList = Arrays.copyOf(shoppingList, shoppingList.length + 1);
        shoppingList[shoppingList.length - 1] = product;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product p : shoppingList) {
            totalCost += p.getCost();
        }
        return totalCost;
    }

    public void printReceipt() {
        System.out.println("=== Grocery Shopping List ===");
        for (Product product : shoppingList) {
            System.out.printf("%-20s (%.2f kg/L) x %.1f - %.2f\n",
                    product.getName(), product.getUnitPrice(), product.getAmount(), product.getCost());
        }
        System.out.printf("Total Cost: %.2f\n", calculateTotalCost());
    }
}
