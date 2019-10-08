package Lab9;

public class User {
    //class property
    private String id;
    private String nams;
    private String address;
    private String tel;

    public User(String id, String nams, String address, String tel) {
        this.id = id;
        this.nams = nams;
        this.address = address;
        this.tel = tel;
    }

    //getter

    public String getId() {
        return id;
    }

    public String getNams() {
        return nams;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nams='" + nams + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
