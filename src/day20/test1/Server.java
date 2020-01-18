package day20.test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        System.out.println("服务器启动");
        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        socket.receive(packet);
        String s = new String(b, 0, b.length);
        System.out.println(s);
        socket.close();

    }
}
