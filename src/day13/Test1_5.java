package day13;

import java.util.HashSet;
import java.util.Iterator;

public class Test1_5 {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("zhangsan");

        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(hashSet);

    }
}
