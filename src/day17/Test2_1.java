package day17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入一个文件路径");
        String str=input.nextLine();
        File file =new File(str);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件创建成功");
        }
        else {
            System.out.println("文件大小："+file.length()+"字节");
        }
    }
}
