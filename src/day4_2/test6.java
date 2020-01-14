package day4_2;

public class test6 {
    public static void main(String[] args) {
        boolean a = false;
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] == arr[j]) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        System.out.println("是否对称"+a);
    }
}
