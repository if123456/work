package day17;

import java.io.File;

public class Test2_3 {
    public static void main(String[] args) {
        File file=new File("C:/aaa");
        getFileName(file);
    }

    public static void getFileName(File file){
        File[] files=file.listFiles();
        for (File f:files){
            if (f.isFile()){
                System.out.println(f.getAbsolutePath());
            }else {
                getFileName(f);
            }
        }
        return;
    }

}
