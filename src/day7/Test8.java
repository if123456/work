package day7;

public class Test8 {
    public static void main(String[] args) {
        String str="javajfiewjavajfiowfjavagkljjava";
        String ch="java";
        System.out.println(str+"字符串中"+ch+"的数量："+getCount(str,"java"));
    }

    public static int getCount(String str,String ch){
        int count=0;
        while(str.indexOf(ch)!=-1){
            int a=str.indexOf(ch);
            str=str.substring(a+ch.length());
            count++;
        }
        return count;
    }
}
