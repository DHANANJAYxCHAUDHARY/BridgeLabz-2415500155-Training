import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ages = new double[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
        }
        double youngest = ages[0];
        double tallest = heights[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest) youngest = ages[i];
            if (heights[i] > tallest) tallest = heights[i];
        }
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}
