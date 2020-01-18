package day21.test9;

import java.io.*;
import java.util.Properties;

public class Test9 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File file = new File("D:\\zuoye\\test1224\\src\\test2.properties");
        Properties p = new Properties();
        if (!file.exists()) {
            file.createNewFile();
            fos = new FileOutputStream(file);
            fos.write("count=null".getBytes());
            fos.close();
        }
        fis = new FileInputStream(file);
        p.load(fis);
        String count = p.getProperty("count");
        if ("null".equals(count)) {
            p.setProperty("count", "0");
        }
        Integer count2 = Integer.parseInt(p.getProperty("count"));
        count2++;
        if(count2==3){
            System.out.println("程序使用次数已满，请续费");
        }
        String s = (String) p.setProperty("count", String.valueOf(count2));
        FileOutputStream fos2 = new FileOutputStream(file);
        p.store(fos2, s);
        System.out.println(p);
        fos2.close();
        fis.close();

    }


}
