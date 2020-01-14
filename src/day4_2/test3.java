package day4_2;

public class test3 {
    public static void main(String[] args) {
        int[] nums={5,10,15};
        System.out.println("nums数组：");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("新数组：");
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*2;
            System.out.print(nums[i]+" ");
        }

    }
}
