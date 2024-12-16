public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y; // Handle potential ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            z = Integer.MAX_VALUE; // or handle differently
        }
        System.out.println(z);

        //Another way to avoid this
        int a = 10;
        int b = 0;
        int c = (b==0) ? 0: a/b; 
        System.out.println(c); 
    }
}