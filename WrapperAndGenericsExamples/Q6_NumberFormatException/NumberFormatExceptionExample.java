public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("12AB");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! NumberFormatException occurred.");
        }
    }
}
