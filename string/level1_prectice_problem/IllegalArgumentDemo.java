public class IllegalArgumentDemo {
    public static void main(String[] args) {
        try {
            String str = "JavaProgramming";
            System.out.println(str.substring(5, 2)); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }
}
