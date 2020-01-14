package day14.test1;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");

        Set<Integer> set = map.keySet();
        System.out.println("for循环：");
        for (Integer a:set){
            System.out.println(a);
        }
        System.out.println("迭代器：");
        Iterator<Integer> iter=set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
