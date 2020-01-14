package day6;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "罗志祥", 35);

        ArrayList<Worker> workers=new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        findMaxAge(workers);
    }

    public static void findMaxAge(ArrayList<Worker> workers){
        Worker maxAgeWorker = new Worker();
        for (int i = 0; i < workers.size(); i++) {
            Worker w=workers.get(i);
            if(w.getAge()>=maxAgeWorker.getAge()){
                maxAgeWorker=w;
            }
        }
        System.out.println("最高年龄worker对象：");
        maxAgeWorker.show();
    }
}
