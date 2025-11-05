import java.util.*;

public class AddPrimitiveExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing automatically converts int → Integer
        numbers.add(10); // Compiler does: numbers.add(Integer.valueOf(10))

        System.out.println("ArrayList: " + numbers);

        // Without autoboxing (manually wrap)
        numbers.add(Integer.valueOf(20));
        System.out.println("After manual boxing: " + numbers);
    }
}
