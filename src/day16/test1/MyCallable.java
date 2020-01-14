package day16.test1;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        Random random=new Random();
        int sum=0;
        for (int i = 0; i < 10; i++) {
            int a=random.nextInt(100)+1;
            System.out.print(a+",");
            sum+=a;
        }
        System.out.println("平均数："+sum/10);
        return null;
    }
}
