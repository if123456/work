package day7;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("adsfgh");
        list.add("sdfg");
        list.add("你好");
        list.add("你好啊啊啊");
        list.add("你好啊");

        System.out.println("源ArrayList：");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        System.out.println("删除后Arraylist:");
        //String[] str=list.toArray(new String[list.size()]);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).length()>4){
                list.remove(list.get(i));
            }
            System.out.print(list.get(i)+",");
        }
    }
}
