package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 17:53
 */

public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {

        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("Hello " + (i + 1));
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hhhhh~~");
        }
    }
}