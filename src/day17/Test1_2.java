package day17;

import java.io.File;
import java.io.IOException;

public class Test1_2 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\aaa\\a.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
