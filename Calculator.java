import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //System.out.println("yeah");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two whole numbers.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + number2);
        
    }
}
