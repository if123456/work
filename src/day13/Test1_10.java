package day13;

import java.util.ArrayList;

public class Test1_10 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list=add("123","456");
        for (String s:list){
            System.out.println(s);
        }
    }

    public static ArrayList add(String... str){
        ArrayList<String > list=new ArrayList<>();
        //list.add(str);
        for (String s:str){
            list.add(s);
        }
        return list;
    }

}
