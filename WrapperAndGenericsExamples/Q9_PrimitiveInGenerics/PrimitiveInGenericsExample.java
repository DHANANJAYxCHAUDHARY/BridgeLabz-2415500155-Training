import java.util.*;

public class PrimitiveInGenericsExample {
    public static void main(String[] args) {
        // ❌ Not allowed: ArrayList<int> list = new ArrayList<int>();
        // Because generics need to store objects, and int is not an object.

        // ✅ Use Wrapper class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("ArrayList<Integer>: " + list);
    }
}
