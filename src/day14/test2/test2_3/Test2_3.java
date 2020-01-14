package day14.test2.test2_3;

public class Test2_3 {
    public static void main(String[] args) throws LoginException{
        //login("uuu", "123");
//        try {
//            login("user", "456");
//        }catch (LoginException e){
//            System.out.println(e);
//        }

        login("user", "123");
    }

    public static void login(String name, String pwd) throws LoginException {
        if (!"user".equals(name)) {
            throw new LoginException("用户名不存在");
        } else if (!"123".equals(pwd)) {
            throw new LoginException("密码错误");
        } else {
            System.out.println("欢迎" + name);
        }
    }
}
