package day20;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP客户端开启");
        Socket client=new Socket("127.0.0.1",8888);
        OutputStream os=client.getOutputStream();
        Scanner input=new Scanner(System.in);
        String str=" hello.服务器,我是客户端";
//        String str=input.nextLine();
        os.write(str.getBytes());
        os.close();
        client.close();


    }
}
