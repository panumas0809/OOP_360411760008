package Lab8;

import java.time.Year;

public class PersonEX {
    String name;
    int bornYear;

    public PersonEX(String name,int bornYear){
        this.name = name;
        this.bornYear = bornYear;

    }
    public void introduce(){
        System.out.print("My name is"+name+",");
        System.out.println("I was born in"+bornYear+",");

    }
}
