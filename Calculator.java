import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //System.out.println("yeah");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two whole numbers.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int operator = 0;
        while (operator >= 5 || operator <= 0) {
            System.out.println("Please input which operator you would like to perform on the two numbers. Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division.");
            operator = input.nextInt();
        }
        switch (operator) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println(number1 / number2);
        }

    }
}
