package day7;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个QQ号：");
        String qq = input.next();
        System.out.println("这个QQ号码是否正确：" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq) {
        char[] ch = qq.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (qq.length() > 12 || qq.length() < 5 || ch[0] == '0') {
                return false;
            } else if (ch[i] > '9' || ch[i] < '0') {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
