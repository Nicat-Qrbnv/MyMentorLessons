package lesson20.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueChallenge {
    public static void main(String[] args) {
        Queue<Customer> customerQueue = new LinkedList<>();

        // Add some customers to the queue
        customerQueue.add(new Customer("Alice", true));    // Sending a package
        customerQueue.add(new Customer("Bob", false));     // Receiving a package
        customerQueue.add(new Customer("Charlie", true));  // Sending a package
        customerQueue.add(new Customer("David", false));
        customerQueue.add(new Customer("Eve", true));

        LinkedList<String> desk1 = new LinkedList<>();
        LinkedList<String> desk2 = new LinkedList<>();

        while (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll();
            if (customer.isSendingPackage()) {
                desk1.offer(customer.getName());
            } else {
                desk2.offer(customer.getName());
            }
        }
    }
}

