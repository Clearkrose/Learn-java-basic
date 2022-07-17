package HSP.thread_.HSP;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 10:44
 */

public class ThreadUse {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.start();

        /* 构造器
         public Thread(Runnable target) {
             init(null, target, "Thread-" + nextThreadNum(), 0);
         }
         */
        Dog dog = new Dog();
        Thread thread = new Thread(dog); //这里使用了【静态代理】
        thread.start();

        mouse mouse = new mouse();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(mouse);
        Thread thread1 = new Thread(integerFutureTask);
        thread1.start();

        for (int i = 0; i < 60; i++) {
            System.out.println("Hi~ " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cat extends Thread {
    int time1 = 0;

    @Override
    public void run() {
        while (true) {
            ++time1;
            System.out.println("Hello~ " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time1 == 80) {
                break;
            }
        }
    }
}

class Dog implements Runnable {
    int time2 = 1;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            time2++;
            System.out.println("AMAO~" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time2 == 100) {
                break;
            }
        }

    }
}

class mouse implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hi, Callable");
        return 1;
    }
}