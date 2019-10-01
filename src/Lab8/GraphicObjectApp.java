package Lab8;

import java.util.Scanner;

public class GraphicObjectApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //input r
        System.out.print("Enter r: ");
        double r = sc.nextDouble();

        GraphicObject O1 = new Circle(r);
        O1.findArea();
        System.out.println(O1.area);




    }
}
