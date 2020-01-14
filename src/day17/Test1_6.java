package day17;

import java.io.File;

public class Test1_6 {
    public static void main(String[] args) {
        File file=new File("C:/aaa/b.txt");
        System.out.println("文件路径"+file.getAbsolutePath());
        System.out.println("文件名"+file.getName());
        System.out.println("文件父路径"+file.getParent());
        System.out.println("文件大小"+file.length()+"字节");


    }
}
