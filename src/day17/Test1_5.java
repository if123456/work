package day17;

import java.io.File;

public class Test1_5 {
    public static void main(String[] args) {
        File file=new File("C:/aaa/a.txt");
        if(file.exists()){
            file.delete();
        }

        File file1=new File("C:/aaa");
        if(file1.exists()){
            file1.delete();
        }

    }

}
