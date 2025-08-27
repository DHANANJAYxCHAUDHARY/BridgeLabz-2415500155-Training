// Employee bonus based on years of service
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int years = scanner.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
