import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        float num1 = 0.0f;
        float num2 = 0.0f;

        Scanner input = new Scanner(System.in);

        int choice = 0;
        while (choice <= 0 || choice >= 3) {
            System.out.println("Welcome to Calculator! Would you like to use whole or floating point numbers? 1 for whole numbers, 2 for floating point numbers.");
            choice = input.nextInt();
        }
        switch (choice) {
            case 2:
                System.out.println("Please input two floating point numbers.");
                num1 = input.nextFloat();
                num2 = input.nextFloat();
                break;
            default:
                System.out.println("Please input two whole numbers.");
                number1 = input.nextInt();
                number2 = input.nextInt();
        }
        
        int operator = 0;
        while (operator >= 5 || operator <= 0) {
            System.out.println("Please input which operator you would like to perform on the two numbers. Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division.");
            operator = input.nextInt();
            if ((operator == 4 && number2 == 0) || (operator == 4 && num2 == 0)) {
                System.out.println("Error: Divide by zero");
                operator = 0;
            }
        }
        switch (operator) {
            case 1:
                if (choice == 1) System.out.println(number1 + number2);
                else System.out.println(num1 + num2);
                break;
            case 2:
                if (choice == 1) System.out.println(number1 - number2);
                else System.out.println(num1 - num2);
                break;
            case 3:
                if (choice == 1) System.out.println(number1 * number2);
                else System.out.println(num1 * num2);
                break;
            default:
                if (choice == 1) System.out.println(number1 / number2);
                else System.out.println(num1 / num2);

        }
        input.close();
    }
}
