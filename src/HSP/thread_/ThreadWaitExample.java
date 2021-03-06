package HSP.thread_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/11 15:43
 * wait() 是 Object 的方法，而 sleep() 是 Thread 的静态方法
 * wait() 会释放锁，sleep() 不会
 * 只能用在同步方法或者同步控制块中使用，否则会在运行时抛出 IllegalMonitorStateExeception
 * 调用 wait() 使得线程等待某个条件满足，线程在等待时会被挂起，当其他线程的运行使得这个条件满足时，
 * 其它线程会调用 notify() 或者 notifyAll() 来唤醒挂起的线程
 */

public class ThreadWaitExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}

class WaitNotifyExample {
    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
