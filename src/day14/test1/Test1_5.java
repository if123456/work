package day14.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1_5 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","baby");
        map.put("谢霆锋","张柏芝");

        Set<Map.Entry<String,String>> set=map.entrySet();

//        for(Map.Entry<String,String>entry:set){
//            System.out.println(entry);
//        }
        Iterator<Map.Entry<String,String>> iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            String name1=entry.getKey();
            String name2=entry.getValue();
            System.out.println(name1+","+name2);
        }
    }
}
