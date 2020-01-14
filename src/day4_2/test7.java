package day4_2;

public class test7 {
    public static void equals(int[] arr1, int[] arr2) {
        boolean a = true;
        if (arr1.length != arr2.length) {
            System.out.println("数组长度不等");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    a = true;
                } else {
                    a = false;
                    break;
                }
            }
            System.out.println("数组是否一致" + a);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 1, 2, 1};
        equals(arr1, arr2);
    }
}
