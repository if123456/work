package day18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
