package day16;

//public class Test3 implements Runnable{
//    public static void main(String[] args) {
//        Thread t=new Thread(new Test3());
//        t.start();
//
//    }
//
//    @Override
//    public void run(int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.println(i);
//        }
//    }
//}
/*Test3不是抽象类，所以要实现Runnable接口中的所有方法，run（int num）是自己定义的方法，
并不是Runnable接口中的run（）方法，所以运行有问题。
实现类重写接口中的方法要与接口中方法名相同，参数相同*/
