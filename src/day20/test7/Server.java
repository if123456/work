package day20.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        System.out.println("服务器开启，等待连接...");
        while (true) {
            Socket server = socket.accept();
            new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("客户端连接成功");
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\1.jpg"));
                        BufferedOutputStream bos = new BufferedOutputStream(server.getOutputStream());
                        int len;
                        byte[] b = new byte[1024];
                        while ((len = bis.read(b)) != -1) {
                            bos.write(b, 0, len);
                        }

                        bos.close();
                        bis.close();
                        server.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        }
    }
}
