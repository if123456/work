package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\a\\1.jpg");
        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
