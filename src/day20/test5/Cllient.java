package day20.test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cllient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a\\1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());

        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
            bos.flush();
        }
        System.out.println("文件发送完毕");
        bos.close();
        bis.close();
        client.close();
        System.out.println("文件上传成功");
    }
}
