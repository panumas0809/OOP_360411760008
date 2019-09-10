package Lab7;

public class PetApp {
    public static void main(String[] args) {
        //create class instant (object)
        Pet pet1 = new Pet();
        pet1.setOwnerName("Kiw");
        pet1.setPetName("Owen");
        pet1.setPetAge(2);

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getpetName());
        System.out.println(pet1.getPetAge());

        Pet pet2 = new Pet();
        pet2.setOwnerName("Peem");
        pet2.setPetName("Cha");
        pet2.setPetAge(3);

        System.out.println(pet2.getOwnerName());
        System.out.println(pet2.getpetName());
        System.out.println(pet2.getPetAge());

        Pet pet3 = new Pet("Peem","cha",3);

        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getpetName());
        System.out.println(pet3.getPetAge());











    }
}
