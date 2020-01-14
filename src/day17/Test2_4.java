package day17;

import java.io.File;

public class Test2_4 {

    public static void main(String[] args) {
        File file=new File("D:/zuoye/test");
        Filter filter=new Filter();
        File[] files=file.listFiles();
        for (File f:files){
            System.out.println(f.getName()+"是否为Java文件 "+filter.accept(f));
        }

    }
}
