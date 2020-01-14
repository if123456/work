package day10.test6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

//student(name,age，score)
//        List<Student>list=new ArrayList<>();
//        List<Student>list2=new ArrayList<>();
//        班级a有若干学生
//        班级b有若干学生
//
//        1打印总共有多少姓张的学生的个数
//        2.先按年龄降序，再按成绩升序排序
//        3.打印2个班级中前3个姓张且年龄小于18岁的学生信息
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list1=new ArrayList<>();
        ArrayList<Student> list2=new ArrayList<>();

        //A班
        list1.add(new Student("李一",15,90));
        list1.add(new Student("张二",17,80));
        list1.add(new Student("张三",18,95));
        list1.add(new Student("王四",10,93));
        list1.add(new Student("张五",16,96));
        list1.add(new Student("李六",18,99));
        list1.add(new Student("张七",11,80));
        list1.add(new Student("李八",13,65));

        //B班
        list2.add(new Student("王一",14,91));
        list2.add(new Student("宋二",17,96));
        list2.add(new Student("王三",20,98));
        list2.add(new Student("李四",15,93));
        list2.add(new Student("王五",16,99));
        list2.add(new Student("张六",18,80));
        list2.add(new Student("王七",17,91));
        list2.add(new Student("张八",16,97));


        //统计有多少个姓张的
        Stream<Student> stream=Stream.concat(list1.stream(),list2.stream());
        long count= stream.filter(n->{
            return n.getName().startsWith("张");
        }).count();
        System.out.println("姓张的人数："+count);

        //排序
        System.out.println("年龄降序，再按成绩升序排序");
        Stream<Student> stream1=Stream.concat(list1.stream(),list2.stream());
        stream1.sorted((Student s1,Student s2)->{
//            if(s2.getAge()-s1.getAge()==0){
//                return s1.getScore()-s2.getScore();
//            }
//             return s2.getAge()-s1.getAge();
            int i=s2.getAge()-s1.getAge();
            if(i==0){
                i=s1.getScore()-s2.getScore();
            }
            return i;
        }).forEach(n->{
            System.out.println(n.toString());
        });

        System.out.println("----------");
        System.out.println("班级中前3个姓张且年龄小于18岁的学生信息:");
        //打印2个班级中前3个姓张且年龄小于18岁的学生信息
        Stream<Student> stream2=Stream.concat(list1.stream(),list2.stream());
        stream2.filter(n->{
            return n.getName().startsWith("张")&&n.getAge()<18;
        }).limit(3).forEach(n->{
            System.out.println(n.toString());
        });

    }
}
