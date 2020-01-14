package day12;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add("abc");
        coll.add('a');
        coll.add(true);
        coll.add(123.123);
        System.out.println(coll);
        System.out.println("集合大小："+coll.size());
        coll.remove(true);
        System.out.println("删除true后"+coll);
        coll.clear();
        System.out.println("清空集合后"+coll.size());
        System.out.println(coll);

    }
}
