package day13;

import java.util.LinkedList;

public class Test1_3 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("123");
        list.add("abc");
        list.add("efg");
        list.add("你好");
        list.add("456");
        list.add(3,"hello");
        System.out.println(list);
        list.set(4,"asd");
        System.out.println(list);
        System.out.println("第2个元素"+list.get(1));
        System.out.println("集合大小"+list.size());
        list.remove(2);
        System.out.println("删除第三个元素"+list);
        list.clear();
    }
}
