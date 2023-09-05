import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Creating Variables
        int n1, n2;

        //Define Scanner Class
        Scanner inp = new Scanner(System.in);

        //Get input from user
        System.out.print("Enter first number: ");
        n1 = inp.nextInt();

        System.out.println("Choose an option: \n'+' for Addition \n'-' for Extraction \n'x' for Multiplication \n'/' for Division");
        String option = inp.next();

        System.out.print("Enter second number: ");
        n2 = inp.nextInt();

        double result = 0;
        switch (option) {
            case "+":
                result = (n1 + n2);
                break;
            case "-":
                result = (n1 - n2);
                break;
            case "x":
                result = (n1 * n2);
                break;
            case "/": {
                if (n2 == 0) {
                    System.out.println("infinitive");
                } else {
                    result = (double) n1 / n2;
                }
            }
                break;
            default:
                System.out.println("Please enter a valid value");
                break;
        }
            System.out.println("Result is : " + result);
    }
}
