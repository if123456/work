package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list集合");
        list.stream().forEach(System.out::println);

        HashSet<Integer>set=new HashSet<>(list);
        System.out.println("set集合");
        set.stream().forEach(System.out::println);

        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println("map集合");
        Set<Integer>set1=map.keySet();
        set1.stream().forEach(n->{
            String s=map.get(n);
            System.out.println("key:"+n+",value:"+s);
        });
    }



}
