package day14.test1;

import java.util.ArrayList;
import java.util.HashMap;

public class Test2_10 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();
        list1.add("黑龙江省");
        list1.add("浙江省");
        list1.add("江西省");
        list1.add("广东省");
        list1.add("福建省");

        ArrayList<String>list2=new ArrayList<>();
        list2.add("哈尔滨");
        list2.add("杭州");
        list2.add("南昌");
        list2.add("广州");
        list2.add("福州");

        HashMap<String,String>map=new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i),list2.get(i));
        }
        System.out.println(map);
    }
}
