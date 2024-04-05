package lesson20.exercise;

// Customer class representing customers with their package type
class Customer {
    private String name;
    private boolean sendingPackage;

    public Customer(String name, boolean sendingPackage) {
        this.name = name;
        this.sendingPackage = sendingPackage;
    }

    public String getName() {
        return name;
    }

    public boolean isSendingPackage() {
        return sendingPackage;
    }
}
