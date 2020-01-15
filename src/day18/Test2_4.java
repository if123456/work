package day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test2_4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a\\score.txt");
        FileOutputStream fos = new FileOutputStream("D:\\a\\score1.txt");
        Properties properties = new Properties();
        int len;
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            String s = new String(b, 0, len);
//            String s1[] = s.split("\r\n|=");
//            // System.out.println(s1.length);
//            for (int i = 0; i < s1.length; i += 2) {
//                properties.setProperty(s1[i], s1[i + 1]);
//            }
//        }
            String s1[]=s.split("\r\n");
            for (int i = 0; i < s1.length; i ++) {
                String[] ss=s1[i].split("=");
                properties.setProperty(ss[0], ss[1]);
            }
        }
//        if (properties.containsKey("lisi")) {
//            properties.setProperty("lisi", "100");
//        }
//
//        Set<String> set = properties.stringPropertyNames();
//        for (String str : set) {
//            System.out.println(str + "，" + properties.getProperty(str));
//            fos.write(str.getBytes());
//            fos.write("=".getBytes());
//            fos.write((properties.getProperty(str)).getBytes());
//            fos.write("\r\n".getBytes());
//        }
//        fos.close();
//        fis.close();
    }
}
