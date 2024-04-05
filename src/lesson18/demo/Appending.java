package lesson18.demo;

public class Appending implements Runnable {

    private final StringBuffer strBff;
    private String str;

    public Appending(String str, StringBuffer strBff) {
        this.str = str;
        this.strBff = strBff;
    }

    @Override
    public void run() {

        synchronized (strBff) {
        strBff.append(str);
        System.out.println (str + " is added: " + strBff);
            try {
//                Thread.sleep(250);
                strBff.notify();
                strBff.wait(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
