package day11;

public class Test5 {
    public static void main(String[] args) {
        String str="a";
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str+="a";
        }
        System.out.println(str);
        long end=System.currentTimeMillis();
        System.out.println("耗时:"+(end-start));

        StringBuilder builder = new StringBuilder("a");
        long start1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append("a");
        }
        System.out.println(builder);
        long end1=System.currentTimeMillis();
        System.out.println("耗时:"+(end1-start1));
    }
}
