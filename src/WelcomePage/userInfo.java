package WelcomePage;

public class userInfo {

    String firstName;
    String lastName;
    int accountNumber;
    String userName;
    String passWord;

    public userInfo(String firstName, String lastName, int accountNumber, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.passWord = passWord;
    }



    @Override
    public String toString() {
        return "userInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
