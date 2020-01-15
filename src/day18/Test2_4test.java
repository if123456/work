package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test2_4test {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("D:\\a\\score.txt");
            fw=new FileWriter("D:\\a\\score1.txt");
            Properties p=new Properties();
            p.load(fr);
            if(p.containsKey("lisi")){
                p.setProperty("lisi","100");
            }
            Set<String> set=p.stringPropertyNames();
            for (String s:set){
                fw.write(s+"="+p.getProperty(s));
                fw.write("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fw.flush();
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
