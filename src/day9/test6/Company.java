package day9.test6;

public class Company implements Money {
    double money=1000000;
    @Override
    public void paySalary(Employee employee) {
        System.out.println("给"+employee.getName()+"发工资 "+employee.getSalary()+"元，公司剩余："+(money-employee.getSalary()));
        money=money-employee.getSalary();
    }
}
