package day17;

import java.io.File;

public class Test1_8 {
    public static void main(String[] args) {
        File file=new File("C:/aaa");
        File[] str= file.listFiles();
        for (File f:str){
            System.out.println(f.getName());
        }

    }
}
