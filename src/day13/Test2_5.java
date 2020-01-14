package day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Test2_5 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
        }
        ArrayList<String> list=new ArrayList<>();
        list.addAll(set);
        for (String s:list){
            System.out.println(s);
        }
    }
}
