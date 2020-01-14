package day16.test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        MyCallable c1=new MyCallable();

        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(c1);
        service.submit(c1);
        service.submit(c1);
        service.shutdown();
    }
}
