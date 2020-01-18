package day20.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接");
        ServerSocket ss=new ServerSocket(8888);
        Socket socket=ss.accept();
        InetAddress address=socket.getInetAddress();
        InputStream is=socket.getInputStream();
        System.out.println(address+" 连接成功");
        byte[]b=new byte[1024];
        int len=is.read(b);
        String str=new String(b,0,len);
        System.out.println(address+" 发送"+str);

        OutputStream os=socket.getOutputStream();
        os.write("接收成功".getBytes());
        os.close();

        is.close();
        socket.close();

    }
}
