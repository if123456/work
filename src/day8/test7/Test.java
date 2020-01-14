package day8.test7;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer("傅红雪",111);
        lecturer.work();
        Tutor tutor=new Tutor("顾琪",122);
        tutor.work();
        Maintainer maintainer=new Maintainer("庖丁",222);
        maintainer.work();
        Buyer buyer=new Buyer();
        buyer.setName("景甜");
        buyer.setNum(233);
        buyer.work();
    }
}