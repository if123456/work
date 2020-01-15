package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\a\\a.txt"),"GBK");
        int len;
        while ((len=isr.read())!=-1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
