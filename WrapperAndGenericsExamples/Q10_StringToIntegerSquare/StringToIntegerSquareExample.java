import java.util.*;

public class StringToIntegerSquareExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String input = sc.nextLine();

        try {
            Integer num = Integer.parseInt(input);
            System.out.println("Square: " + (num * num));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, not a number!");
        }
    }
}
