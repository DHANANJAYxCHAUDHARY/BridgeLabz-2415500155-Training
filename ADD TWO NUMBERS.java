import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Ask for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;

        // Print result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
