package day9.test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher t = new Teacher("马云", 45);
        SportTeacher t2 = new SportTeacher("大姚", 35);
        Student s = new Student("小王", 20);
        SportStudent s2 = new SportStudent("王中王", 21);
        // goToSport(t);
        goToSport(t2);
        //goToSport(s);
        goToSport(s2);
    }

    public static void goToSport(Sport sport) {
        sport.playBasketball();
    }
}
