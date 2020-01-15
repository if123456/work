package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("stu.txt"));
        ArrayList<Student> stu = (ArrayList<Student>) in.readObject();

        for (int i = 0; i < stu.size(); i++) {
            Student s = stu.get(i);
            System.out.println(s);
        }
        in.close();
    }
}
