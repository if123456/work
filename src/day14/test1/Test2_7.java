package day14.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一句英文:");
        String str = input.nextLine();
        HashMap<String,Integer>map=new HashMap<>();
        String s[]=str.split(" ");
        for (int i=0;i<s.length;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i],1);
            }else{
                Integer a=map.get(s[i]);
                map.replace(s[i],++a);
            }
        }
        Set<Map.Entry<String,Integer>>set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            System.out.println(entry);
        }
    }
}
