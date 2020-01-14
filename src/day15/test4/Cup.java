package day15.test4;

public class Cup implements Runnable {

    private  Integer cup=100;
    private static Object obj=new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(cup<=0){
                    System.out.println(Thread.currentThread().getName()+"卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"卖出第"+(101-cup)+"个，总共剩余"+(cup-1)+"个");
                cup--;
            }
        }
    }
}
