package day12.test7;


import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();

        Student s1 = new Student("张三", 18, 90);
        Student s2 = new Student("李四", 16, 85);
        Student s3 = new Student("小王", 17, 80);
        Student s4 = new Student("大王", 18, 95);
        Student s5 = new Student("张飒", 18, 75);

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);

        //迭代器
        Iterator<Student> iter = stu.iterator();
        Iterator<Student> iter2 = stu.iterator();
        double sum = 0;
        double max = s1.getScore();
        double min = s1.getScore();

        while (iter.hasNext()) {
            sum += iter.next().getScore();
        }

        while (iter2.hasNext()) {
            double d=iter2.next().getScore();
            if(d<min){
                min=d;
            }
            if(d>max){
                max=d;
            }
        }

       /* for (Student s : stu) {
            if (s.getScore() < min) {
                min = s.getScore();
            }
            if (s.getScore() > max) {
                max = s.getScore();
            }
        }*/


        System.out.println("总分：" + sum);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + sum / stu.size());
    }
}
