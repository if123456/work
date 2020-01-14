package day12;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("源数组"+list);
        swap(list,1,2);
        System.out.println("交换后"+list);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("源数组"+list1);
        swap(list1,2,3);
        System.out.println("交换后"+list1);
    }

    public static <E> void swap(ArrayList<E> arr,int a,int b){
            E e=arr.get(a);
            arr.set(a,arr.get(b));
            arr.set(b,e);
    }

}
