import javax.swing.*;
import java.util.Scanner;
public class userLogin {
    public static void main(String[] args) {
        //Creating Variables
        String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Username: ");
        userName = inp.nextLine();

        System.out.print("password: ");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("java1234")) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("The information you entered is incorrect. ");
            System.out.println("Would you like to change your password? Press 'Y' for YES");
            select = inp.nextLine();

            if (select.equals("Y") || select.equals("y")){
                System.out.println("Please enter your new password. *it should be different from your last 3 Password");
                newPassword = inp.nextLine();

                if (newPassword.equals("java1234")) {
                    System.out.println("Try a different password");
                }
                else {
                    System.out.println("new password has been created");
                }
            }
        }
    }
}
