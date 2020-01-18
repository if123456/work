package day20.test5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {

        System.out.println("服务器启动，等待连接");
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String s = df.format(date);
        ServerSocket socket = new ServerSocket(8888);
        while (true) {
            Socket server = socket.accept();
            BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a\\" + s + ".jpg"));
            byte[] b = new byte[1024];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }

            bos.flush();
            bos.close();
            bis.close();
            server.close();
            System.out.println("文件上传已保存");
        }
    }
}
