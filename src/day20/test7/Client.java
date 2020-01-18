package day20.test7;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端开启连接");
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
        String s=df.format(date);
        Socket client = new Socket("127.0.0.1", 8888);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\b\\"+s+"download.jpg"));
        BufferedInputStream bis = new BufferedInputStream(client.getInputStream());

        int len;
        byte[] b = new byte[1024];
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        System.out.println("下载成功");
        bis.close();
        bos.close();
        client.close();
    }

}


