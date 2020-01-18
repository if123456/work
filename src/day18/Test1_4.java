package day18;

import sun.nio.cs.ext.GBK;

import java.io.FileInputStream;
import java.io.IOException;

public class Test1_4 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis= null;
        try {
            fis = new FileInputStream("D:\\a\\a.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a;
        while((a=fis.read())!=-1){
            System.out.print((char) a);
        }
    fis.close();
    }
}
