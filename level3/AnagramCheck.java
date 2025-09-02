import java.util.Arrays;
import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase().replaceAll("\s", "");
        String s2 = sc.nextLine().toLowerCase().replaceAll("\s", "");
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}