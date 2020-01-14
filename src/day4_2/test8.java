package day4_2;

public class test8 {
    public static void chengji(String name,char[] arr){
        char[] anwser={'A','D','B','C','D'};
        int count=0;
        for(int i=0;i<anwser.length;i++){
            if(anwser[i]==arr[i]){
                count++;
            }
        }
        System.out.println("满分10分,"+name+"得分:"+count*2);
    }

    public static void main(String[] args) {
        char[] ming={'D','C','B','A','D'};
        char[] hong={'A','D','B','C','D'};
        char[] huang={'A','D','B','C','A'};
        char[] qiang={'A','B','C','D','D'};
        chengji("小明",ming);
        chengji("小红",hong);
        chengji("小黄",huang);
        chengji("小强",qiang);
    }
}
