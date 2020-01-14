package day10.test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            User u = new User();
            u.setId(i);
            list.add(u);
        }
        System.out.println("未分组");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId() + "-"+list.get(i).getType()+"，");
        }

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        r1.setFilter(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 10 && u.getId() < 20) {
                    u.setType("v1");
                }
            }
        });

        r2.setFilter(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 20 && u.getId() < 30) {
                    u.setType("v2");
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            r1.recep(u);
            r2.recep(u);
            r3.recep(u);
        }
        System.out.println();
        System.out.println("已分组");
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.print(u.getId() + "-" + u.getType()+" ");
            if(i%9==0)
                System.out.println();
        }
    }
}
