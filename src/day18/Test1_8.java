package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1_8 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\a\\info.txt");
        Scanner input=new Scanner(System.in);
        while(true){
            String str=input.nextLine();
            if ("886".equals(str)){
                break;
            }
            fos.write(str.getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
