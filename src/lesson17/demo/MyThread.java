package lesson17.demo;

import java.util.Arrays;

import static lesson17.demo.Main.talkingPillow;

public class MyThread extends Thread {
    private final int ID;

    public MyThread(int ID) {
        this.ID = ID;
    }

    @Override
    public void run() {
        synchronized (talkingPillow) {
            try {
                sleep(500);
                System.out.println(ID + " has started.");

                talkingPillow.notifyAll();

                sleep(500);
                System.out.println(ID + " is going to wait.");

                talkingPillow.wait(200);

                sleep(500);
                System.out.println(ID + ": the end");
            } catch (InterruptedException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}
