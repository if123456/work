package day19;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student("����",20,"��");
        Student s2=new Student("С��",20,"Ů");
        Student s3=new Student("����",20,"��");

        ArrayList<Student> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\a\\stu.txt"));
//        for (int i = 0; i < stu.size(); i++) {
//            Student s=stu.get(i);
//            osw.write(s.toString());
//            osw.write("\r\n");
//        }

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\a\\stu.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
