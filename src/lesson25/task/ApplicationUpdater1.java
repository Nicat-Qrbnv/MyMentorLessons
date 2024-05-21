package lesson25.task;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationUpdater1 {
    private static final ArrayList<Application> applications = new ArrayList<>();

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

    public static void setup(Application application, Scanner scanner) {
        if (!applications.contains(application)) {
            applications.add(application);
            System.out.println("Application is setup: " + application);
        } else {
            for (Application app : applications) {
                if (app.equals(application)) {
                    if (app.getVersion() < application.getVersion()) {
                        applications.remove(app);
                        applications.add(application);
                        System.out.println("Application is updated: " + application);
                    } else {
                        System.out.println("Are you sure you want to downgrade this application?");
                        if (scanner.nextLine().equals("yes")) {
                            applications.remove(app);
                            applications.add(application);
                            System.out.println("Application is updated: " + application);
                        }
                    }
                }
            }
        }
    }
}
