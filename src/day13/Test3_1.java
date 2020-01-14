package day13;

import java.util.*;

public class Test3_1 {
    public static void main(String[] args) {
        HashSet<String> hong=new HashSet<>();
        HashSet<String> lan=new HashSet<>();
        Random random=new Random();
        int b=random.nextInt(16);
        for (int i = 1; i < 34; i++) {
            hong.add("红"+i);
        }
        for (int i = 1; i < 17; i++) {
            lan.add("蓝"+i);
        }
        System.out.println(hong);
        System.out.println(lan);
        System.out.println("随机生成一注双色球:");
        List<String> honglist=new ArrayList<>(hong);
        List<String> lanlist=new ArrayList<>(lan);
        for (int i = 0; i < 6; i++) {
            int a=random.nextInt(33);
            System.out.print(honglist.get(a)+",");
        }
        System.out.println(lanlist.get(b));

    }
}
