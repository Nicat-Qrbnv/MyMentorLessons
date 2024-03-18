package lesson17.homework;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        OddThread oddThread = new OddThread();

        EvenRunnable evenRunnable = new EvenRunnable();
        Thread evenThread = new Thread(evenRunnable);

        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}
