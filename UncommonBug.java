public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x / y; // Potential ArithmeticException
        System.out.println(z);
    }
}