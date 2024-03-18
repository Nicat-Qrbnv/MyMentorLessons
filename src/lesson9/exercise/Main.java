package lesson9.exercise;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Milk", 2.99);
        Item item2 = new Item("Bread", 1.99);
        Item item3 = new Item("Eggs", 3.49);

        ShoppingList shoppingList = new ShoppingList(new Item[] {item1, item2});

        System.out.println("Initial Shopping List:");
        shoppingList.displayItems();
        System.out.println("Total Cost: $" + shoppingList.calculateTotalCost());

        shoppingList.addItem(item3);

        System.out.println("\nUpdated Shopping List:");
        shoppingList.displayItems();
        System.out.println("Total Cost: $" + shoppingList.calculateTotalCost());
    }
}

