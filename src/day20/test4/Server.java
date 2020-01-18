package day20.test4;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接");
        ServerSocket server = new ServerSocket(8888);
        Scanner input = new Scanner(System.in);
        while(true){
            Socket socket = server.accept();
            System.out.println("连接成功");
            InputStream br =socket.getInputStream();
            OutputStream bw = socket.getOutputStream();

            int len;
            byte[]b=new byte[1024];
            while ((len = br.read(b)) != -1) {
                String s=new String(b,0,len);
                System.out.println("客户端：" + s);
                break;
            }

            System.out.println("服务器:");
            String s = input.nextLine();
            bw.write(s.getBytes());

            bw.close();
            br.close();
            socket.close();
        }
    }
}
