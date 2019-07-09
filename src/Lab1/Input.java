package Lab1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = scanner1.nextLine();

        System.out.println(name);

        System.out.print("กรุณากรอกอายุ? : ");
        int อายุ = scanner.nextInt();
        System.out.print(อายุ);

        System.out.print("E-mail? : ");
        String E = scanner1.nextLine();
        System.out.print(E);

    }//main







}//class
