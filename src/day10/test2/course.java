package day10.test2;

import java.util.ArrayList;

public class course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> student;

    public course() {
    }

    public course(String name, Teacher teacher, ArrayList<Student> student) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public void show(){
        System.out.println("课程名称："+getName());
        System.out.println("授课老师："+teacher.getName());
        teacher.dianming(student);

    }
}
