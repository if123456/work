package day14.test1;

import java.util.ArrayList;
import java.util.HashMap;

public class Test2_6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        char[] ch={};
        HashMap<Character,Integer> map=new HashMap<>();
        for(String s:list){
            ch=s.toCharArray();
            for(char c:ch){
                System.out.println(c);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    Integer a = map.get(c);
                    map.replace(c, ++a);
                }
            }
        }
        System.out.println(map);
    }
}
