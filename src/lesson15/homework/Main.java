package lesson15.homework;

public class Main {
    public static void main(String[] args) {
        GroceryShopping shoppingList = new GroceryShopping();

        shoppingList.addProduct(new Diary("Milk", 2.50, 2));
        shoppingList.addProduct(new FreshProduce("Apples", 3.99, 1.5));
        shoppingList.addProduct(new Meat("Ground Beef", 7.99, 1.2));
        shoppingList.addProduct(new Diary("Cheese", 5.99, 1));

        shoppingList.printReceipt();
    }
}

