package day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("D:\\a\\ps.txt");
        System.setOut(ps);
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(str);
    }
}
