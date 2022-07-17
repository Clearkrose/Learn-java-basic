package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 15:50
 */

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {

        Note note = new Note();
        Thread thread = new Thread(note);
        thread.start();

        Thread.sleep(1000 * 20);
        note.setLoop(false);
    }
}

class Note implements Runnable {
    private int num = 0;
    private boolean loop = true; //通知

    @Override
    public void run() {
        while(loop) {
            System.out.println("hi " + (++num) + "s" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}