/**
 * This is a class that extends class User.
 */
public class AccountHolder extends User {
    /**
     * reward and cardNumber are two variables that are unique to AccountHolder
     */
    public int reward;
    public int cardNumber;

    /**
     *
     * @param name
     * @param password
     * @param age
     * @param reward
     * @param cardNumber
     * This method is a constructor for AccountHolder
     */
    public AccountHolder(String name, String password, int age, int reward, int cardNumber) {
        super(name,password,age);
        this.reward = reward;
        this.cardNumber = cardNumber;
    }
}
