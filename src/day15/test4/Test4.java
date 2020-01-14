package day15.test4;

public class Test4 {
    public static void main(String[] args) {
        Cup cup=new Cup();
        Thread t1=new Thread(cup,"实体店");
        Thread t2=new Thread(cup,"网店");
        t1.start();
        t2.start();

    }
}
