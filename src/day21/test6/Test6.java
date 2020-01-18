package day21.test6;

public class Test6 {
    public static void main(String[] args) {
        Class c=User.class;
        User user=new User();
        User user2=new User();
        user.setProperty(user,"name","zhangsan");
        user2.setProperty(user2,"name","lisi");

        System.out.println(user);
        System.out.println(user.getProperty(user2,"name"));
        System.out.println(user2);
    }


}
