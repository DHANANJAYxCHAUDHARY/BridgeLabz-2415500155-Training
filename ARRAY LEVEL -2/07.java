import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w < 0 || h < 0) {
                i--;
            } else {
                personData[i][0] = w;
                personData[i][1] = h;
                double heightM = h / 100;
                personData[i][2] = w / (heightM * heightM);
                double bmi = personData[i][2];
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 24.9) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obesity";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }
    }
}
