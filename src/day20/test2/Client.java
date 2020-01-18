package day20.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        Socket client=new Socket("127.0.0.1",8888);
        OutputStream os=client.getOutputStream();
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        os.write(str.getBytes());

        InputStream is=client.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        System.out.println(new String(b,0,len));


        os.close();
        client.close();
    }
}
