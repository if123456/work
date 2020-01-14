package day17;

import java.io.File;
import java.util.Scanner;

public class Test3_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        File file=new File(str);
        System.out.println(file.getName());
        FileShow(file);

    }
    public static void FileShow(File file){
        File[]files=file.listFiles();
        for(File f:files){
            if(f.isFile()){
                System.out.println(f.getName());
            }else {
                System.out.println(f.getName());
                FileShow(f);
            }
        }
    }

}
