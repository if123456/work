package day16.test8;


public class Test8 {

    public static void main(String[] args) {
        Student student = new Student();
            new Thread(() -> {
                try {
                    student.inputStudent(student);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread() {
                @Override
                public void run() {
                    try {
                        student.showStudent(student);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }


}
