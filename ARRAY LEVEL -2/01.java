import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0, totalOld = 0.0, totalNew = 0.0;

        for (int i = 0; i < 10; i++) {
            double sal = sc.nextDouble();
            double yrs = sc.nextDouble();
            if (sal < 0 || yrs < 0) {
                i--;
            } else {
                salary[i] = sal;
                years[i] = yrs;
            }
        }

        for (int i = 0; i < 10; i++) {
            double b = years[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            bonus[i] = b;
            newSalary[i] = salary[i] + b;
            totalBonus += b;
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}
