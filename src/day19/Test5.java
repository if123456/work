package day19;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\a\\a.txt"), "GBK");
        osw.write("我爱java");
        osw.close();

    }
}
