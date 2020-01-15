package day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader ois = new BufferedReader(new FileReader("D:\\a\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a\\test1.txt"));
        ArrayList<String> list = new ArrayList<>();
        String len = null;
        while ((len = ois.readLine()) != null) {
           list.add(len);
        }
        Collections.reverse(list);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            String s=list.get(i);
            bw.write(s);
            bw.write("\r\n");
        }
        bw.close();
        ois.close();
    }
}
