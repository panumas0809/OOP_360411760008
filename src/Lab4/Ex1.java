package Lab4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int x, y;


                //input
        System.out.print("Enter integer 1: ");
        x = sc.nextInt();
        System.out.print("Enter integer 2: ");
        y = sc.nextInt();


        int max = Max(x,y);
        int max2 = Max2(x,y);
        int min = Min(x,y);
        System.out.println("The maximum value is" + max);
        System.out.println("The maximum value is" + max2);
        System.out.println("The maximum value is" + min);

    }

    private static int Min(int x, int y) {
        return x<y ? x : y;
    }

    private static int Max2(int x, int y) {
        return x > y ? x : y;
    }

    private static int Max(int x, int y) {
        int result;
        if (x>y)
            result = x;
        else
            result =y;
        return result;




    }
}
