package lesson20.exercise;

// Desk class representing the desks for sending and receiving packages
class Desk {
    private String name;

    public Desk(String name) {
        this.name = name;
    }

    public void serveCustomer(Customer customer) {
        System.out.println("Desk " + name + " is serving customer: " + customer.getName());
    }
}
