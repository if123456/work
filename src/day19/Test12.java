package day19;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test12 {
    public static void main(String[] args) {
        Path p= Paths.get("D:\\a\\shi.txt");
        Path p2=Paths.get("D:\\a\\shi2.txt");
        String line;
        BufferedReader br=null;
        BufferedWriter bw=null;
        BufferedReader br2=null;
        try {
            br=new BufferedReader(new FileReader(p.toString()));
            bw=new BufferedWriter(new FileWriter(p2.toString()));
            br2=new BufferedReader(new FileReader(p2.toString()));
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            while((line=br2.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
