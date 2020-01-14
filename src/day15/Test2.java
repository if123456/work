package day15;

public class Test2 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("播放背景音乐");
//            }
//        }).start();
//
//        new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("显示画面");
//            }
//        }.run();

        new Thread(() -> {
            while (true) {
                System.out.println("播放背景音乐");
            }
        }).start();


        new Thread(() -> {
            while (true) {
                System.out.println("显示画面");
            }
        }).start();
    }
}

