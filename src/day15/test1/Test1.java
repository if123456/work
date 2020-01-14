package day15.test1;

public class Test1 {

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();

        ThreadTest tt=new ThreadTest();
        Thread thread1=new Thread(tt);
        thread1.start();

    }
}
