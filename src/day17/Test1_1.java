package day17;

import java.io.File;

public class Test1_1 {
    public static void main(String[] args) {
        File f1=new File("D:\\aaa.txt");
        File f2=new File("D:\\","aaa.txt");

        System.out.println(f1.exists());
        System.out.println(f2.exists());
    }
}
