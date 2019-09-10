package Lab7;

public class Pet {
    //Class Attributes
    private  String ownerName;
    private  String petName;
    private  int petAge;

    //constructor
    public Pet(){}

    public Pet(String ownerName,String petName,int petAge){
        this.ownerName = ownerName;
        this.petName = petName;
        this.petAge = petAge;
    }


    //getter and setter methods
    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }


    public String getpetName(){
        return this.petName;
    }
    public void setPetName(String newpetName){
        this.petName = newpetName;
    }

    public int getPetAge(){
        return this.petAge;
    }
    public void setPetAge(int newpetAge){
        this.petAge = newpetAge;
    }

}
