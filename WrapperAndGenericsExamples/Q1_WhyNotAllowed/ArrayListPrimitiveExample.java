import java.util.*;

public class ArrayListPrimitiveExample {
    public static void main(String[] args) {
        // ❌ Not allowed: ArrayList<int> list = new ArrayList<int>();
        // Because generics only work with objects, not primitive types.

        // ✅ Correct:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("ArrayList<Integer>: " + list);
    }
}
