package day20.test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        DatagramSocket socket=new DatagramSocket();
        InetAddress address=InetAddress.getLocalHost();
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        DatagramPacket packet=new DatagramPacket(str.getBytes(),0,str.length(),address,8888);
        socket.send(packet);
        socket.close();
    }
}
