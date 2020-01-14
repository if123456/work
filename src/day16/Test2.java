package day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                int a=1;
                for (int i = 1; i <=10 ; i++) {
                    a*=i;
                }
                System.out.println("10!="+a);
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                int a=1;
                for (int i = 1; i <=8 ; i++) {
                    a*=i;
                }
                System.out.println("8!="+a);
            }
        };
        Runnable r3=new Runnable() {
            @Override
            public void run() {
                int a=1;
                for (int i = 1; i <=5 ; i++) {
                    a*=i;
                }
                System.out.println("5!="+a);
            }
        };

        ExecutorService service= Executors.newFixedThreadPool(3);
        service.submit(r1);
        service.submit(r2);
        service.submit(r3);
        service.shutdown();
    }
}
