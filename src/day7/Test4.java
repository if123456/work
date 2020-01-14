package day7;

public class Test4 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char [] ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("将str字符串转换为小写："+str.toLowerCase());
        System.out.println("将str字符串转换为大写："+str.toUpperCase());
        System.out.println("将str字符串中的字符‘o’转换为‘6’："+str.replace('o','6'));
        System.out.println("将str字符串中的字符‘ll’转换为‘LL’："+str.replace("ll","LL"));

    }
}
