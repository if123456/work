package day16.test8;

import java.util.Scanner;

public class Student {
    private String name;
    private String sex;
    private static Object obj = new Object();
    private static int A = 1;

    public Student() {
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void inputStudent(Student student) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        while (true) {
            synchronized (obj) {
                if (A != 1) {
                    obj.wait();
                }
                String name = input.nextLine();
                String sex = input.nextLine();
                student.setName(name);
                student.setSex(sex);
                A = 2;
                obj.notify();
            }

        }
    }


    public static void showStudent(Student student) throws InterruptedException {
        while (true) {
            synchronized (obj) {
                if (A != 2) {
                    obj.wait();
                }
                System.out.println(student.toString());
                A = 1;
                obj.notify();
            }
        }
    }
}
