package day13;

import java.util.ArrayList;
import java.util.Collections;

public class Test1_9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(33);
        list.add(55);
        list.add(77);
        list.add(11);

        Collections.sort(list);
        System.out.println("排序后"+list);
        Collections.shuffle(list);
        System.out.println("打乱顺序"+list);
        Collections.reverse(list);
        System.out.println("翻转后");
        for(int a:list){
            System.out.println(a);
        }
    }
}
