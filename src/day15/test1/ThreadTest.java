package day15.test1;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("这是runnable线程");
    }
}
