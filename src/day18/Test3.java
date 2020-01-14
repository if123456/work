package day18;

import java.io.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        int count=0;
        String str=input.nextLine();
        File file=new File(str);
        File file2=new File("D:\\b");
        copyJava(file,file2);
        System.out.println("复制完成");
        File[] files=file2.listFiles();
        for (File f:files){
            if(f.getName().endsWith("java")){
                count++;
            }
        }
        System.out.println("复制java文件 "+count+"个");

    }


    public static void copyJava(File file,File desfile) throws IOException {
        File[] files=file.listFiles();
        for (File f:files){
            if(f.isFile()){
                if(f.getName().endsWith("java")){
                    FileInputStream fis=new FileInputStream(f.getAbsoluteFile());
                    FileOutputStream fos=new FileOutputStream(desfile+"\\"+f.getName());
                    int len;
                    byte[]b=new byte[1024];
                    while ((len=fis.read(b))!=-1){
                        fos.write(b,0,len);
                    }
                    fos.close();
                    fis.close();
                }
            }else {
                copyJava(f,desfile);
            }
        }

    }

}
