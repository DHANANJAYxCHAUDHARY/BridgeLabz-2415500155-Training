import java.util.Scanner;

class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] words = str.split("\s+");
        System.out.println(words.length);
    }
}