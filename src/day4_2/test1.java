package day4_2;

public class test1 {
    public static void main(String[] args) {
        int[] arr={12,33,25,6,16};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //System.out.println(arr.length);
        System.out.println("数组最小值为："+min);
    }
}
