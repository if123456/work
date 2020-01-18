package day21.test3;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args)throws Exception {
        Class c=Student.class;
        System.out.println(c);

        Student s1=(Student) c.newInstance();
        s1.setName("张三");
        s1.setAge(10);
        System.out.println(s1);

        Constructor<Student> student=c.getConstructor(String.class,Integer.class);
        Student s2=student.newInstance("李四",10);
        System.out.println(s2);

    }
}
