package day16.test9;

import java.util.concurrent.locks.ReentrantLock;

public class Test9 {
    public static int a = 100;
    public static Object obj = new Object();
    public static int b = 0;
    public static int c = 0;

    public static void main(String[] args) {
        DoubleColorBallUtil ball = new DoubleColorBallUtil();
        ReentrantLock lock = new ReentrantLock();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (a <= 0) {
                            System.out.println("入场完毕");
                            break;
                        }
                        System.out.println("编号为" + (101 - a) + "的员工从" + Thread.currentThread().getName() + " 入场" + ball.create());
                        a--;
                    }
                    if ("后门".equals(Thread.currentThread().getName())) {
                        ++b;
                    } else {
                        ++c;
                    }
                }
                System.out.println("前门入场人数" + c);
                System.out.println("后门入场人数" + b);
            }
        };

        Thread t1 = new Thread(r1, "后门");
        Thread t2 = new Thread(r1, "前门");
        t1.start();
        t2.start();

    }
}
