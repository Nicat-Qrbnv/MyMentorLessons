package lesson17.demo;

import java.util.Arrays;

import static lesson17.demo.Main.talkingPillow;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        synchronized (talkingPillow) {
            try {
                sleep(1000);
                System.out.println(this.getId() + " started");

                talkingPillow.notifyAll();
                talkingPillow.wait();

                sleep(1000);
                System.out.println(this.getId() + " is going to wait");
                talkingPillow.notifyAll();

            } catch (InterruptedException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}
