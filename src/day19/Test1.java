package day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\a\\a.txt"));
        bos.write("ancde".getBytes());
        bos.flush();
        bos.close();
    }
}
