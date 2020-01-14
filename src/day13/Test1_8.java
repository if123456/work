package day13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test1_8 {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");

        System.out.println("迭代器");
        Iterator<String> iter=set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-----------------");
        System.out.println("增强for循环");
        for (String str:set){
            System.out.println(str);
        }
    }

}
