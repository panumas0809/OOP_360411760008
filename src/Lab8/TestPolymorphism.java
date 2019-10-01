package Lab8;

public class TestPolymorphism {
    public static void main(String[] args) {
        PersonEX PersonEX1,PersonEX2,PersonEX3;
        PersonEX1= new PersonEX("Mark",1980);
       PersonEX2 = new Sheriff("Mateo",1981,"California");
        PersonEX3 = new Police("Danny",1986,"NYC");

        PersonEX1.introduce();
        PersonEX2.introduce();
        PersonEX3.introduce();
    }
}
