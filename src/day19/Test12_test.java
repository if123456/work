package day19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test12_test {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("D:\\a\\shi.txt");
        Path p2=Paths.get("D:\\a\\shi2.txt");

        Files.copy(p, p2);
        InputStreamReader isr=new InputStreamReader(new FileInputStream(p2.toString()),"GBK");
        int len;
        while((len=isr.read())!=-1){
            System.out.print((char) len);
        }
    }
}
