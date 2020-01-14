package day13;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2_3 {

    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933",
                "98765432102","67891","12347809933"};
        LinkedList<String> list=new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            if(list.contains(strs[i])==false){
                list.add(strs[i]);
            }
        }

        System.out.println("增强for循环遍历");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("---------------");
        System.out.println("迭代器遍历");
        Iterator<String> iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
