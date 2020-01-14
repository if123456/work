package day18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a.txt");
        byte[] b="qwertyuiop".getBytes();
        fos.write(b);
        fos.close();
    }
}
