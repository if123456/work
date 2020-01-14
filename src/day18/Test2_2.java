package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_2 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\b");
        String str="D:\\a\\";
        int len;
        File[] files=file.listFiles();
        for (File f:files){
            FileInputStream fis=new FileInputStream(f.getAbsoluteFile());
            FileOutputStream fos=new FileOutputStream(str+f.getName());
            while((len=fis.read())!=-1){
                fos.write(len);
            }
            fos.close();
            fis.close();
        }

    }
}
