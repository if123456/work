package day17;

import java.io.File;

public class Test1_7 {
    public static void main(String[] args) {
        File file=new File("C:/aaa");
        if(file.isDirectory()){
            System.out.println(file.getName()+"是文件夹");
        }else {
            System.out.println(file.getName()+"不是文件夹");
        }

        File file1=new File("C:/aaa/b.txt");
        if (file1.isFile()){
            System.out.println(file1.getName()+"是文件");
        }else {
            System.out.println(file1.getName()+"不是文件");
        }
    }
}
