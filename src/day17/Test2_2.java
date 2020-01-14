package day17;

import java.io.File;
import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个文件路径");
        String str = input.nextLine();
        File file = new File(str);

        if (file.isFile()) {
            System.out.println("文件大小：" + file.length() + "字节");
        } else if (file.isDirectory()) {
            int sum = 0;
            File[] f = file.listFiles();
            for (File ff : f) {
                sum += ff.length();
            }
            System.out.println("所有文件大小：" + sum);
        }
    }
}
