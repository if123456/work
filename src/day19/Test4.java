package day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\b\\data.txt"));
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\b\\data.txt"));
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            String str = input.nextLine();
//            bos.write(str.getBytes());
//            bos.write("\r\n".getBytes());
//        }
//        bos.close();
//        System.out.println("输入被校验的验证码");
//        String s = input.nextLine();
//        int len;
//        byte[] b = new byte[1024];
//        while ((len = bis.read(b)) != -1) {
//            ArrayList<String> list = new ArrayList<>();
//            String[] s1 = new String(b, 0, len).split("\r\n");
//            for (int i = 0; i < s1.length; i++) {
//                list.add(s1[i]);
//            }
//            if(list.contains(s)){
//                System.out.println("校验成功");
//            }else {
//                System.out.println("校验失败");
//            }
//        }
//        bis.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\b\\data.txt"));
        BufferedReader br=new BufferedReader(new FileReader("D:\\b\\data.txt"));
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String str = input.nextLine();
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        System.out.println("输入被校验的验证码");
        String s=input.nextLine();
        String line=null;
        ArrayList<String> list = new ArrayList<>();
        while((line=br.readLine())!=null){
            list.add(line);
        }
        if(list.contains(s)){
            System.out.println("校验成功");
        }else {
            System.out.println("校验失败");
        }
        br.close();
    }
}
