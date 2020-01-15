package day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a\\b.txt"));
        byte[] b = "I love java".getBytes();
        bos.write(b);
        bos.close();

    }
}
