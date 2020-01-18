package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a\\stu.txt");
        Scanner input=new Scanner(System.in);
        String s="\\d-([\\u4e00-\\u9fa5]{2,3}|[a-z]{3,10})";
        System.out.println("输入学生学号姓名（学号-姓名）");
        while(true){
            String str=input.nextLine();
            if ("end".equals(str)){
                break;
            }
            else if(!str.matches(s)){
                System.out.println("输入格式有误");
            }
            else {
                fos.write(str.getBytes());
                fos.write("\r\n".getBytes());
            }

        }
        fos.close();
    }

}
