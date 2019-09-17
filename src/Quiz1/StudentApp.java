package Quiz1;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("name");
        String n = sc.nextLine();

        System.out.println("id");
        String id = sc.nextLine();

        System.out.println("major");
        String m = sc.nextLine();


        System.out.println("subjects A");
        String s1 = sc.nextLine();
        System.out.println("subjects B");
        String s2 = sc.nextLine();
        System.out.println("subjects C");
        String s3 = sc.nextLine();

        double G1 = compareGrade(s1);
        double G2 = compareGrade(s2);
        double G3 = compareGrade(s3);

        double GPA = (G1 + G2 + G3) / 3.0;

        Student std1 = new Student("panumas", "008", "MIT", GPA);
        System.out.println(std1.toString());


    }//main

    private static double compareGrade(String s1) {

        if (s1.equals("A")) {
            return 4.00;
        } else if (s1.equals("B+")) {
            return 3.5;
        } else if (s1.equals("B")) {
            return 3;
        } else if (s1.equals("C+")) {
            return 2.5;
        } else if (s1.equals("C")) {
            return 2;
        } else if (s1.equals("D+")) {
            return 1.5;
        } else if (s1.equals("D")) {
            return 1;
        } else if (s1.equals("F")) {

            return 0.0;
        }

        return 0.0;
    }
}

