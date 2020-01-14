package day9.test6;

public class Test6 {
    public static void main(String[] args) {
        Manager m=new Manager("张小强",9000);
        Coder c=new Coder("李晓亮",5000);
        Company company=new Company();
        company.paySalary(m);
        company.paySalary(c);
    }
}
