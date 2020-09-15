package WelcomePage;

import java.util.Scanner;

public class WelcomePage {
    Scanner scan = new Scanner(System.in);

    public static void newUser(){
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


    public static void userLogin(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String name = scan.next();
        System.out.println("Please enter your password: ");
        String word = scan.next();


    }

    void menu(){
        System.out.println("1- New User");
        System.out.println("2- User Login");
        System.out.println("");
        System.out.println("What is your request?");
        int choice = scan.nextInt();
        if(choice==1){
            newUser();
        }
        else if (choice==2){
            userLogin();
        }

    }


    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("******  OsmanYasin BANK ******");
        System.out.println("        Welcome!  ");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("1- New User");
        System.out.println("2- User Login");
        System.out.println("");
        System.out.println("What is your request?");
        int choice = scan.nextInt();
        if(choice==1){
            newUser();
        }
        else if (choice==2){
            userLogin();
        }

         */

        accountOperations acc1 = new accountOperations();
        acc1.deposit(100);
        System.out.println(acc1);


    }
}
