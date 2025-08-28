import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        for (int d = 0; d < 10; d++) {
            System.out.println("Digit " + d + " frequency: " + freq[d]);
        }
    }
}
