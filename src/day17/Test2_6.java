package day17;

import java.io.File;
import java.util.Scanner;

public class Test2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        File file=new File(str);
        System.out.println("文件夹大小为："+calculate(file)+"字节");

    }

    public static long calculate(File file){
        File[] files=file.listFiles();
        long size=0;
        for (File f:files){
            if(f.isFile()){
                size+=f.length();
            }
            else if(f.isDirectory()){
                size+=calculate(f);
            }
        }
        return size;
    }

}
