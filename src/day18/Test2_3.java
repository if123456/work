package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2_3 {
    public static void main(String[] args) throws IOException{
        File file=new File("D:\\a\\a.txt");
        count(file,'a');
    }

    public static void count(File file, char c)throws IOException {
        FileInputStream fis=new FileInputStream(file);
        int len;
        int count=0;
        while((len=fis.read())!=-1){
            if((char)len==c){
                count++;
            }
        }
        System.out.println(c+" 出现 "+count+"次");

    }

}
