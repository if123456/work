package day18;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1_5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\a.txt");
        byte[] b=new byte[5];
        int a;
        while((a=fis.read(b))!=-1){
            System.out.println(new String(b,0,a));
        }

        fis.close();
    }
}
