public class IntegerComparisonExample {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));       // true (cached values -128 to 127)
        System.out.println("c == d : " + (c == d));       // false (outside cache range)
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("c.equals(d): " + c.equals(d)); // true
    }
}
