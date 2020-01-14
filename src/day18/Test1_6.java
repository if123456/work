package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\a\\1copy.jpg");
        byte[]b=new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
