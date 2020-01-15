package day19;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\1.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\b\\1.jpg"));

        int len;
        byte[] b=new byte[1024];
        while ((len=bis.read(b))!=-1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
    }
}
