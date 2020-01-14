package day6;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("集合大小："+list.size());
        for (int i = 0; i <list.size() ; i++) {
            Student s=list.get(i);
            System.out.println(s.getId()+","+s.getName()+","+s.getHength());
        }
        System.out.println("-----------------------");
        System.out.println("身高1.70以上的学员：");
        ArrayList<Student> stu=gettall(list);
        for (int i = 0; i <stu.size() ; i++) {
            Student ss=stu.get(i);
            System.out.println(ss.getId()+","+ss.getName()+","+ss.getHength());
        }
    }

    public static ArrayList<Student> gettall(ArrayList<Student> list){
        ArrayList<Student> listh=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Student s=list.get(i);
            if(s.getHength()>1.7){
                listh.add(s);
            }
        }
        return listh;
    }

}
