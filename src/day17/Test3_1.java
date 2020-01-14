package day17;

import java.io.File;
import java.io.FileFilter;

public class Test3_1 {
    public static void main(String[] args) {
        File file=new File("D:/zuoye/test");
        Filter(file);
    }

    public static void Filter(File file){
        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length()<1024*200;
            }
        });

        for (File f:files){
            if(f.isFile()){
                System.out.println(f.getAbsolutePath());
            }
            else{
                Filter(f);
            }
        }
    }
}
