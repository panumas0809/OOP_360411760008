package Lab8;

public class Triangle extends GraphicObject{

    //attributes
    private double a;
    private double r;


    //constructor
    public Triangle(){}

    public Triangle(double a, double r) {
        this.a = a;
        this.r = r;
    }

    @Override
    void findArea() {
        super.area = 0.5 *(a * r);
        System.out.println("The area of triangle :"+super.area);

    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
