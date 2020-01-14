package day14.test1;

import day14.test1.test1_6.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1_7 {
    public static void main(String[] args) {
        HashMap<Student, String> map=new HashMap<>();
        map.put(new Student("张三",18), "广州");
        map.put(new Student("李四",18), "北京");
        map.put(new Student("王五",18), "西安");
        map.put(new Student("旺旺",18), "上海");
        map.put(new Student("萝莉",18), "成都");
        Set<Student> set=map.keySet();
        for (Student s:set){
            String city=map.get(s);
            System.out.println(s+","+city);
        }
        System.out.println("------------------------------");
        Set<Map.Entry<Student, String>> entrt=map.entrySet();
        for (Map.Entry<Student, String> entry:entrt){
            String city=entry.getValue();
            Student stu=entry.getKey();
            System.out.println(stu+","+city);
        }
    }
}
