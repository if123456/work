package day13;

import java.util.HashSet;
import java.util.Scanner;

public class Test2_8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashSet<Integer>set=new HashSet<>();
        while (true){
            int a=input.nextInt();
            if (a==-1){
                break;
            }
            set.add(a);

        }
        System.out.println(set);
        int sum=0;
        for (Integer i:set){
            sum+=i;
        }
        System.out.println("和为："+sum);
        System.out.println("平均数为："+sum/set.size());
    }
}
