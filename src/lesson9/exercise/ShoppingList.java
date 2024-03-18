package lesson9.exercise;

import java.util.Arrays;

class ShoppingList {
    Item[] items;

    public ShoppingList(Item[] items) {
        this.items = items;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void addItem(Item newItem) {
        Item[] newItems = Arrays.copyOf(items, items.length + 1);
        newItems[items.length] = newItem;
        items = newItems;
    }

    public void displayItems() {
        System.out.println("Shopping List:");
        for (Item item : items) {
            System.out.println("- " + item);
        }
    }
}
