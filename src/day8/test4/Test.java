package day8.test4;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("王小平",50,"java");
//        teacher.setName("王小平");
//        teacher.setSubject("java");
        teacher.tecah();
        System.out.println("------------------");
        Student student=new Student(90);
        student.setName("李小乐");
        student.exam();
    }
}
