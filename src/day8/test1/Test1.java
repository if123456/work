package day8.test1;

public class Test1 {
    public static void main(String[] args) {
        //Preson preson=new Preson("马化腾",10);
        Coder coder=new Coder();
        coder.setName("马化腾");
        coder.eat();
        coder.sleep();
        coder.code();
        System.out.println("---------------");
        Teacher teacher=new Teacher();
        teacher.setName("马云");
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
