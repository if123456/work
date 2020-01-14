package day10.test4;

public class Test4 {
    public static void main(String[] args) {
        Apple a1 = new Apple(5.0, "青色");
        Apple a2 = new Apple(3.0, "红色");
        Worker worker = new Worker();

        System.out.println(worker.pickApple(new Compare(), a1, a2));

        CompareAble c1 = new CompareAble() {
            @Override
            public void compare() {
                System.out.println("挑红的");
                if("红色".equals(a1.getColor())){
                    System.out.println(a1.toString());
                }
                if("红色".equals(a2.getColor())){
                    System.out.println(a2.toString());
                }
            }
        };
        c1.compare();

    }
}