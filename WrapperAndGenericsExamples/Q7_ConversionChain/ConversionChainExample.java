public class ConversionChainExample {
    public static void main(String[] args) {
        int primitive = 50;
        Integer obj = Integer.valueOf(primitive);
        String str = obj.toString();
        Integer again = Integer.parseInt(str);

        System.out.println("int: " + primitive);
        System.out.println("Integer: " + obj);
        System.out.println("String: " + str);
        System.out.println("Back to Integer: " + again);
    }
}
