package day20.test6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args)throws IOException {
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream os = client.getOutputStream();
        InputStream is = client.getInputStream();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        os.write(s.getBytes());
        int len;
        byte[] b = new byte[1024];
        while ((len = is.read(b)) != -1) {
            String str = new String(b, 0, len);
            System.out.println(str);
            break;
        }
        is.close();
        os.close();
        client.close();
    }
}
