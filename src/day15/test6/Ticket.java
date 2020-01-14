package day15.test6;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket extends Thread {
    private Integer ticket = 100;
    //private static Object obj=new Object();
    ReentrantLock lock = new ReentrantLock();

    public Ticket() {
    }

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
//            synchronized (obj){
            lock.lock();
            if (ticket <= 0) {
                System.out.println("票卖完了");
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "买了一张票,剩余票数为" + (ticket - 1));
            ticket--;
            lock.unlock();
        }
    }


}
