package day13.test2_4;

import java.util.HashSet;
import java.util.Iterator;

public class Test2_4 {
    public static void main(String[] args) {
        HashSet<Student> stu=new HashSet<>();
        stu.add(new Student("张三",20,"男"));
        stu.add(new Student("张三",20,"男"));
        stu.add(new Student("李四",19,"男"));
        stu.add(new Student("海雍",18,"男"));
        stu.add(new Student("邓彩",20,"女"));
        stu.add(new Student("钟暮",18,"男"));
        stu.add(new Student("曲瑜",17,"女"));
        stu.add(new Student("阿高",19,"男"));
        stu.add(new Student("安珍",18,"女"));
        stu.add(new Student("元听",18,"女"));

        Iterator<Student> iterator=stu.iterator();
        System.out.println("使用迭代器遍历");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        System.out.println("增强for循环遍历");
        for (Student s:stu){
            System.out.println(s);
        }
    }
}
