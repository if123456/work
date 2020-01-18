package day20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        while (true) {
            Socket server = socket.accept();
            new Thread(){
                @Override
                public void run() {
                    try {
                        InputStream is = server.getInputStream();
                        OutputStream os = server.getOutputStream();
                        System.out.println("连接成功");
                        FileInputStream fis = new FileInputStream("D:\\a\\user.txt");
                        FileOutputStream fos = new FileOutputStream("D:\\a\\user.txt", true);
                        Properties p = new Properties();

                        p.load(fis);
                        System.out.println(p);

                        int len;
                        byte[] b = new byte[1024];
                        String s;
                        while ((len = is.read(b)) != -1) {
                            s = new String(b, 0, len);
                            System.out.println(s);
                            String[] ss = s.split("=");
                            System.out.println(ss.length);
                            if (!(p.containsKey(ss[0]))) {
                                os.write("注册成功".getBytes());
                                fos.write("\r\n".getBytes());
                                fos.write(s.getBytes());
                                break;
                            } else {
                                if (ss[1].equals(p.getProperty(ss[0]))) {
                                    os.write("登录成功".getBytes());
                                    break;
                                } else {
                                    os.write("密码错误".getBytes());
                                    break;
                                }
                            }

                        }
                        os.close();
                        is.close();
                        server.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();


        }
    }
}
