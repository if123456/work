package day14.test2;

public class Test1_6 {
    public static void main(String[] args) throws Exception{
        testTryCatch();
        testThrows();
    }
    public static char charAt(String str, int index) throws Exception {
        if ("null".equals(str)) {
            throw new Exception("字符串不能为null");
        } else if ("".equals(str)) {
            throw new Exception("字符串不能为空");
        }else if(index<0||index>str.length()-1){
            throw new Exception("索引越界");
        }
        return str.charAt(index);
    }

    public static void testThrows() throws Exception{
        System.out.println(charAt("null",1));
    }

    public static void testTryCatch() {
        try {
            System.out.println(charAt("",1));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}