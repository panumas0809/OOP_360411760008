package Lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("ชื่อ-สกุล: ");
        String a = scanner.nextLine();

        System.out.print("เลขบัตรประจำตัวประชน: ");
        String b = scanner.nextLine();

        System.out.print("ที่อยู่: ");
        String c = scanner.nextLine();

        System.out.print("อีเมล: ");
        String e = scanner.nextLine();

        System.out.print("โทร: ");
        String t = scanner.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(t);


    }//main

}//class
