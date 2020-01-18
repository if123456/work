package day20.test4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端开启连接");
        while (true){
            Socket client = new Socket("127.0.0.1", 8888);
            OutputStream bw = client.getOutputStream();
            InputStream br = client.getInputStream();
            Scanner input = new Scanner(System.in);
            System.out.println("客户端：");
            String str = input.nextLine();
            if("exit".equals(str)){
                bw.write("客户端断开连接".getBytes());
               System.exit(0);
            }
            bw.write(str.getBytes());

            int len;
            byte[]b=new byte[1024];
            while ((len = br.read(b)) != -1) {
                String s=new String(b,0,len);
                System.out.println("服务器：" + s);
                break;
            }

            bw.close();
            br.close();
            client.close();
        }

    }

}


