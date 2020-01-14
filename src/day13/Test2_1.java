package day13;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2_1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println("源ArrayList"+list);
        HashSet set=new HashSet();
        set.addAll(list);
        System.out.println("除去重复元素"+set);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}
