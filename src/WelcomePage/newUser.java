package WelcomePage;

import java.util.Scanner;

public class newUser {
    public void newUser(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide the information below");

        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();
        System.out.println("Please enter your username: ");
        String userName = scan.next();
        System.out.println("Please enter your password: ");
        String passWord = scan.next();

        userInfo user1 = new userInfo(firstName,lastName,12345,userName,passWord);

        System.out.println("You are all set!");
        System.out.println(user1);


    }
}
