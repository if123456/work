package day6;

public class Student {
    private String name;
    private String id;
    private double hength;

    public Student() {
    }

    public Student(String id, String name, double hength) {
        this.name = name;
        this.id = id;
        this.hength = hength;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHength(double hength) {
        this.hength = hength;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getHength() {
        return hength;
    }
}
