package day14.test1.test1_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1_6 {
    public static void main(String[] args) {
        HashMap<String,Student> map=new HashMap<>();
        map.put("广州",new Student("张三",18));
        map.put("北京",new Student("李四",18));
        map.put("西安",new Student("王五",18));
        map.put("上海",new Student("旺旺",18));
        map.put("成都",new Student("萝莉",18));
        Set<String>set=map.keySet();
        for (String s:set){
            Student stu=map.get(s);
            System.out.println(s+","+stu);
        }
        System.out.println("------------------------------");
        Set<Map.Entry<String,Student>> entrt=map.entrySet();
        for (Map.Entry<String,Student> entry:entrt){
            String city=entry.getKey();
            Student stu=entry.getValue();
            System.out.println(city+","+stu);
        }

    }
}
