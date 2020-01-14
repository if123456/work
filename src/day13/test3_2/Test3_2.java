package day13.test3_2;

import java.util.HashSet;
import java.util.Iterator;

public class Test3_2 {
    public static void main(String[] args) {
        HashSet<Student> stu1 = new HashSet<>();
        HashSet<Student> stu2 = new HashSet<>();

        stu1.add(new Student("张三", 15));
        stu1.add(new Student("李四", 15));
        stu1.add(new Student("卓文轩", 15));
        stu1.add(new Student("周子昂", 15));
        stu1.add(new Student("年欣可", 15));

        stu2.add(new Student("舒贝", 15));
        stu2.add(new Student("香锐", 15));
        stu2.add(new Student("浦楚", 15));
        stu2.add(new Student("苟哲", 15));
        stu2.add(new Student("甫江", 15));

        HashSet<HashSet<Student>> list = new HashSet<>();
        list.add(stu1);
        list.add(stu2);
        int a=1;
        System.out.println("for循环遍历");
        for (HashSet<Student> lists : list) {
            System.out.println("学科"+a);
            for (Student s:lists){
                System.out.println(s);
            }
            System.out.println("=====================");
            a++;
        }

        System.out.println("迭代器遍历：");
        Iterator<HashSet<Student>> iter1=list.iterator();

        while (iter1.hasNext()){
            Iterator<Student> iter2=iter1.next().iterator();
            while(iter2.hasNext()){
                System.out.println(iter2.next());
            }
            System.out.println("=====================");
        }

    }
}
