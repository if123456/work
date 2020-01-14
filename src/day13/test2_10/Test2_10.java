package day13.test2_10;

import java.util.HashSet;
import java.util.Iterator;

public class Test2_10 {
    public static void main(String[] args) {
        HashSet<Student> stu = new HashSet<>();
        Student s1 = new Student("张飒", 20, 90d);
        stu.add(s1);
        stu.add(new Student("张三", 20, 90d));
        stu.add(new Student("李四", 20, 85d));
        stu.add(new Student("王五", 20, 91d));
        stu.add(new Student("钱六", 20, 95d));
        stu.add(new Student("孙七", 20, 80d));

        Iterator<Student> iter = stu.iterator();
        double sum = 0;

        Student min = null;
        Student max = null;
        while (iter.hasNext()) {
            max = iter.next();
            min = iter.next();
            break;
        }
        for (Student ss : stu) {
            sum += ss.getScore();
        }
        System.out.println("总分:" + sum);
        System.out.println("平均分:" + sum / stu.size());

        for (Student s : stu) {
            System.out.println(s);
        }

        for (Student s : stu) {
            if (s.getScore() < min.getScore()) {
                min = s;
            }
            if (s.getScore() > max.getScore()) {
                max = s;
            }
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);

    }
}
