package Lab5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num [] = new int[5];

        //input
        num = inputData(num);

        //output
        printData (num);

        //find average
        findAverage(num);



    }

    private static void findAverage(int[] num) {
        int totol = 0;
        for (int val : num){
            totol += val;
        }
        System.out.println("Totol: "+totol);
        System.out.println("Average:"+(totol/num.length));
    }

    private static void printData(int[] num) {
        System.out.println("Data in Array");
        for (int val:num){
            System.out.print(val+" ");
        }

              {

        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length ; i++) {
            System.out.print("Enter integer");
            num[i] = sc.nextInt();

        }
        return num;
    }

}
