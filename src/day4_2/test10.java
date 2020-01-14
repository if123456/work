package day4_2;

public class test10 {
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={99,100,98,97,96};
        int max=max(arr);
        //System.out.println(max);
        int min=min(arr);
        //System.out.println(min);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int avg=(sum-max-min)/3;
        System.out.println("最终得分："+avg);
    }
}
