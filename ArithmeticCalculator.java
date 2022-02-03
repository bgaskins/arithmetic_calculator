import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String [] args) {

        // Declaring the variables
        double userInput1 = 0;
        double userInput2 = 0;
        double result = 0;
        byte option = 0;

        // Inserting the scanner object
        Scanner scan = new Scanner(System.in);

        // Asking for user input for calculation choice
        System.out.println("The Arithmetic Calculator");
        System.out.println("Choose Option 1 to Add");
        System.out.println("Choose Option 2 to Subtract");
        System.out.println("Choose Option 3 to Multiply");
        System.out.println("Choose Option 4 to Divide");
        option = scan.nextByte();

        // Asking users for their numbers for calculations
        System.out.println("Enter your first number:");
        userInput1 = scan.nextDouble();
        System.out.println("Enter your second number:");
        userInput2 = scan.nextDouble();

        // Using options to decide the users choice of calculations: + - * /
        if (option == 1) {
            result = userInput1 + userInput2;
            System.out.println("The result is: " + result);
        } else if (option == 2) {
            result = userInput1 - userInput2;
            System.out.println("The result is: " + result);
        } else if (option == 3) {
            result = userInput1 * userInput2;
            System.out.println("The result is: " + result);
        } else if (option == 4) {
            result = userInput1 / userInput2;
            System.out.println("The result is: " + result);
        } else {
            System.out.println("This option is invalid");
        }
        // User gets their result
        
    }
}