package lesson25.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ApplicationUpdater2 {
    private static final HashMap<Application, Double> applications = new HashMap<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        setup(new Application("Intellij", 3.5), scanner);
        setup(new Application("Intellij", 3.7), scanner);
        setup(new Application("Intellij", 3.9), scanner);
        setup(new Application("Intellij", 4.0), scanner);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }

    public static void setup(Application app, Scanner scanner) {
        Double curVer = applications.getOrDefault(app, 0.0);
        if (curVer < app.getVersion()) {
            applications.put(app, curVer);
            System.out.println("Application is installed: " + app);
        } else {
            if (scanner.nextLine().equals("yes")) {
                applications.put(app, curVer);
                System.out.println("Application is installed: " + app);
            }
        }
    }
}
