package day14.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1_4 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","baby");
        map.put("谢霆锋","张柏芝");

        Set<String> set=map.keySet();
        Iterator<String> iter=set.iterator();
        while (iter.hasNext()){
            String name=iter.next();
            String name2=map.get(name);
            System.out.println(name+","+name2);
        }
    }
}
