package day14.test1;

import java.util.HashMap;
import java.util.Set;

public class Test2_3 {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        Set<Integer>set=map.keySet();
        for (Integer i:set){
            String name=map.get(i);
            System.out.println(i+","+name);
        }
        map.put(5,"李晓红");
        map.remove(1);
        map.replace(2,"周林");
        System.out.println(map);

    }
}
