package day6;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("马云", 50, 20000d));
        userList.add(new User("马化腾", 45, 15000d));
        userList.add(new User("王健林", 55, 10000d));
        userList.add(new User("王健林2", 55, 9000d));
        userList.add(new User("王健林3", 55, 350000d));

        for (int i = 0; i < userList.size(); i++) {
            User u=userList.get(i);
            System.out.println("姓名："+u.getName()+"，年龄："+u.getAge()+"，工资："+u.getMoney());
        }

        //排序
        for (int i = 0; i < userList.size(); i++) {
            for (int j = 0; j < userList.size()-i-1; j++) {
                if(userList.get(j).getMoney()<userList.get(j+1).getMoney()){
                    User u=userList.get(j);
                    userList.set(j,userList.get(j+1));
                    userList.set(j+1,u);
                }
            }
        }
        System.out.println("排序后：");
        for (int i = 0; i < userList.size(); i++) {
            User u=userList.get(i);
            System.out.println("姓名："+u.getName()+"，年龄："+u.getAge()+"，工资："+u.getMoney());
        }


        ArrayList<User> list2=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(userList.get(i));
        }

        System.out.println("工资前三：");
        for (int i = 0; i < list2.size(); i++) {
            User u=list2.get(i);
            System.out.println("姓名："+u.getName()+"，年龄："+u.getAge()+"，工资："+u.getMoney());
        }


    }
}
