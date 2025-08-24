public class NumberFormatDemo {
    public static void main(String[] args) {
        try {
            String str = "abc123";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }
}
