package day10.test2;

import java.util.ArrayList;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianming(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getChuqin()+"："+students.get(i).getName());
        }
    }
}
