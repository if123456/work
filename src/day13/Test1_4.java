package day13;

import java.util.LinkedList;

public class Test1_4 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("123");
        list.add("abc");
        list.add("efg");
        list.add("你好");
        list.add("456");
        System.out.println(list);
        list.addFirst("a");
        list.addLast("e");
        System.out.println(list);
        System.out.println("获取第一个元素"+list.getFirst());
        System.out.println("获取最后一个元素"+list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
