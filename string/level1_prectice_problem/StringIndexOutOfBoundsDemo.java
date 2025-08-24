public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            System.out.println(str.charAt(10)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }
}
