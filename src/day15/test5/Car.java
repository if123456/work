package day15.test5;

public class Car implements Runnable {
    private static Integer seat=80;
    private static Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(seat<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"上车---剩余"+(seat-1)+"个座位");
                seat--;
            }
        }
    }
}
