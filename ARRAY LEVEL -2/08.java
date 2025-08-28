import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();
            if (p < 0 || c < 0 || m < 0) {
                i--;
            } else {
                marks[i][0] = p;
                marks[i][1] = c;
                marks[i][2] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            double avg = percentage[i];
            if (avg >= 90) grade[i] = "A";
            else if (avg >= 75) grade[i] = "B";
            else if (avg >= 60) grade[i] = "C";
            else if (avg >= 40) grade[i] = "D";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
