package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 22:04
 */

public class DeadLock {
    public static void main(String[] args) {

        DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
        deadLockDemo1.start();

        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo2.start();
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object(); //保证多线程，共享一个对象
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}