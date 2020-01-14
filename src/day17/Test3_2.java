package day17;

import java.io.File;
import java.util.Scanner;

public class Test3_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        File file=new File(str);
        DeleteFile(file);
        System.out.println("删除成功");

    }

    public static void DeleteFile(File file){
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()){
                f.delete();
            }
            else if (f.isDirectory()){
                DeleteFile(f);
                f.delete();
            }
        }
    }
}
