package day18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a.txt",true);
        for (int i = 0; i <5 ; i++) {
            fos.write("I love java".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
