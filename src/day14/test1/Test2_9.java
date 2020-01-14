package day14.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test2_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashMap<String,Double>map=new HashMap<>();
        while(map.size()<5){
            String s=input.nextLine();
            String[] str=s.split(",");
            for (int i = 0; i < str.length; i+=2) {
                map.put(str[i],Double.parseDouble(str[i+1]));
            }
        }
        System.out.println(map);
        map.remove("C++");
        map.replace("java",38.5);
        Set<String>set=map.keySet();
        for (String s:set){
            Double price=map.get(s);
            System.out.println(s+","+price);
        }
        System.out.println("-------------------");
        Set<Map.Entry<String,Double>>set1=map.entrySet();
        for(Map.Entry<String,Double> entry:set1){
            System.out.println(entry);
        }
    }
}
