package lesson17.demo;

public class Main {
    static final Object talkingPillow = new Object();

    public static void main(String[] args) throws InterruptedException {


        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();

//        MyThread2 t4 = new MyThread2();
//        MyThread2 t5 = new MyThread2();
//        MyThread2 t6 = new MyThread2();

        t1.start();
        t2.start();
        t3.start();

//        t4.start();
//        t5.start();
//        t6.start();


    }
}
