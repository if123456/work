package day14.test1;

import java.util.HashMap;

public class Test1_1 {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"张三");
        map.put(2, "李四");
        map.put(3, "王五");
        System.out.println(map);
        //map.put("萝莉",3);
        map.replace(3,"萝莉");
        System.out.println("修改值为3的vaule"+map);
        System.out.println("获取值为3的vaule："+map.get(3));
        map.remove(3);
        System.out.println("删除值为3的vaule"+map);
    }
}
