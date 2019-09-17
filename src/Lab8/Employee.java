package Lab8;

public class Employee extends Person {

    private String empID;

    public Employee(String name, String id,String empID) {
        super(name, id);
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                '}'+super.toString();
    }
}
