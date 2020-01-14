package day14.test1;

import java.util.HashMap;
import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        while(map.size()<5){
            String name=input.next();
            Integer age=input.nextInt();
            map.put(name,age);
        }
        System.out.println(map);
    }
}
