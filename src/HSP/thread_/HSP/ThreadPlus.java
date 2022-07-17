package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 11:39
 */

public class ThreadPlus {
    public static void main(String[] args) {

        User1 user1 = new User1();
        Thread thread1 = new Thread(user1);
        thread1.start();

        User2 user2 = new User2();
        Thread thread2 = new Thread(user2);
        thread2.start();
    }
}

class User1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("Hi " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class User2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 80; i++) {
            System.out.println("Hello " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
