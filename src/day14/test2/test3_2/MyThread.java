package day14.test2.test3_2;

import java.util.Random;

public class MyThread extends Thread{
    @Override
    public void run() {
        Random random=new Random();
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            int a=random.nextInt(901)+100;
            sum+=a;
        }
        System.out.println(sum);
    }
}
