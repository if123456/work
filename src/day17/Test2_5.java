package day17;

import java.io.File;
import java.util.Scanner;

public class Test2_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        File file=new File(str);
        File[] files=file.listFiles();
        for (File f:files){
            f.delete();
        }
        file.delete();
        System.out.println("删除完成");
    }
}
