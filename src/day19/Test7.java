package day19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Student s1=new Student("张三",20,"男");
        Student s2=new Student("小红",20,"女");
        Student s3=new Student("李四",20,"男");

        ArrayList<Student> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stu.txt"));
//        for (int i = 0; i < stu.size(); i++) {
//            oos.writeObject(stu.get(i));
//            oos.writeObject("\r\n");
//        }
        oos.writeObject(stu);
//        oos.writeObject("\r\n");
//        oos.writeObject(s2);

        oos.close();
    }
}
