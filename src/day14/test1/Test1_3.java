package day14.test1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test1_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");

        Collection<String> list=map.values();
        System.out.println("for循环：");
        for (String a:list){
            System.out.println(a);
        }
        System.out.println("迭代器：");
        Iterator<String> iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
