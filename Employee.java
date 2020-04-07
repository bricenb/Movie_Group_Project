/**
 * This class extends User
 * Team Name: Bricen Bennett,John Saidi, Jackson G.,Thomas Jervey.
 */
public class Employee extends User{
    public int idNumber;

    /**
     *
     * @param name
     * @param password
     * @param age
     * @param idNumber
     * This is a constructor for Employee
     */
    public Employee(String name, String password,int age, int idNumber) {
        super(name, password,age);
        this.idNumber = idNumber;
    }
}
