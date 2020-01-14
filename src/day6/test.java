package day6;

import day5.test2.Student;

import java.util.*;

public class test {
    public static void main(String[] args) {
      /*  Scanner in=new Scanner(System.in);
        Student[] students=new Student[3];
      // students[0]=new Student("ming",10,"java");
       students[1]=new Student("hong",10,"java");
//        students[2]=new Student("hunag",10,"java");
//
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("ming",10,"java"));
        list.add(0,students[1]);

        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println(s.getName()+s.getAge());
        }
    }*/
       /* ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");
        list.add("二麻子");
        printList(list);
    }

    public static void printList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size()+1; i++) {
            if (i == list.size()){
                System.out.print("}");
            }else{
                System.out.print(list.get(i) + "@");
            }
        }
    }*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        ArrayList<Integer> arr = getList(list);
        System.out.println(arr);
    }

    public static ArrayList<Integer> getList(ArrayList<Integer> list) {
        //用于存放是偶数的元素
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            //如果是偶数则将此元素存入新的临时集合
            if (number % 2 == 0) {
                tempList.add(number);
            }
        }//将存放偶数的集合返回
         return tempList;
    }
}
