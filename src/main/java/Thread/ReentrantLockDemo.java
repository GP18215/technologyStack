package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/5/16
 * Time: 12:50
 * Description: No Description
 */
public class ReentrantLockDemo {

    private static int count = 0;
    private static Lock lock = new ReentrantLock();


    public static void inc(){
        lock.lock();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        count++;

        lock.unlock();
    }


    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                public void run() {
                    ReentrantLockDemo.inc();
                }
            }).start();;
        }

        Thread.sleep(3000);
        System.out.println(count);
    }

}
