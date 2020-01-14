package day4;

public class test4 {
    public static char getChar(int num){
        char ch=(char)num;
        if('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z'||ch>='0'&&ch<='9'){
            return ch;
        }
        else
            return ' ';
    }
    public static void main(String[] args) {
        char a=getChar(48);
        //System.out.println((char)(49));
        System.out.println(a);
    }
}
