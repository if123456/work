package day15.test5;

public class Test5 {
    public static void main(String[] args) {
        Car car=new Car();
        Thread t1=new Thread(car,"前门");
        Thread t2=new Thread(car,"中门");
        Thread t3=new Thread(car,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
