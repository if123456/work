package day10.test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("小明","旷课");
        Student s2=new Student("小红","上课");
        Student s3=new Student("小黄","上课");
        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Teacher teacher=new Teacher("张老师");
        course course=new course("java",teacher,students);
        course.show();
    }
}
