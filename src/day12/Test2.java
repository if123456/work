package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String >list=new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        Iterator<String > iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
