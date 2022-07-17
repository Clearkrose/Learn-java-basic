package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 11:53
 */

public class SellTicket {
    public static void main(String[] args) {

        Conductor conductor = new Conductor();
        Thread thread1 = new Thread(conductor);
        thread1.start();

        Thread thread2 = new Thread(conductor);
        thread2.start();

        Thread thread3 = new Thread(conductor);
        thread3.start();
    }
}

class Conductor implements Runnable {
    private static int tickets = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (tickets <= 0) {
                    System.out.println("售票结束");
                    break;
                }

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程名" + Thread.currentThread().getName() + "票数： " + (--tickets));
            }
        }
    }
}