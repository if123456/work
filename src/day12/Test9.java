package day12;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");

        int a=frequency(list,"a");
        System.out.println("a出现次数："+a);
    }

    public static int frequency(ArrayList<String> arr, String key){
        int count=0;
        for(String s:arr){
            if(s.equals(key)){
                count++;
            }
        }
        return count;
    }

}
