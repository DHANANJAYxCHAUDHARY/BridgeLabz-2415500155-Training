import java.util.*;

public class ArrayListCharacterExample {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'b', '3', 'z', '7'));
        for (char ch : chars) {
            if (Character.isDigit(ch))
                System.out.println(ch + " is a Digit");
            else if (Character.isLetter(ch))
                System.out.println(ch + " is an Alphabet");
            else
                System.out.println(ch + " is neither Digit nor Alphabet");
        }
    }
}
