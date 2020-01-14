package day16.test6;

import java.util.ArrayList;
import java.util.Comparator;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> stu=new ArrayList<>();
        stu.add(new Student("张三",95));
        stu.add(new Student("李四",96));
        stu.add(new Student("小红",90));
        stu.add(new Student("小蓝",88));
        stu.add(new Student("小明",89));

//        stu.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getScore()-o1.getScore();
//            }
//        });

        stu.sort((Student o1, Student o2)->{
            return o2.getScore()-o1.getScore();
        });
        for (Student n : stu) {
            System.out.println(n);
        }

    }
}
