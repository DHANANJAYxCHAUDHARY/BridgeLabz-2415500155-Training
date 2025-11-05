public class StringToDoubleExample {
    public static void main(String[] args) {
        String str = "45.99";
        Double d = Double.parseDouble(str);
        System.out.println("Double value: " + d);
        System.out.println("Integer part: " + d.intValue());
    }
}
