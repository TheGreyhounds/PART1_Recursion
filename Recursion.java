public class Recursion {
    public Recursion() {
        testFactorial();
    }
    
    public static void main(String[] args) {
        new Recursion();
    }
    
    public void testFactorial() throws ArithmeticException {
        System.out.println("The classic example of recursion in programming is the factorial function.");
        System.out.println("The factorial function simply takes a number and multplies it by incremently");
        System.out.println("one less than itself, until it reaches 1, and then returns the resulting product.");
        
        // Because the final test_n is 0, factorial() throws an ArithmeticException
        for (int test_n = 10; test_n >= 0; test_n--) {
            System.out.println(test_n + "! == " + factorial(test_n));
        }
    }
    
    public int factorial(int n) throws ArithmeticException{
        if (n == 1) {
            return n;
        } else if (n < 1) {
            throw new ArithmeticException("Factorial input cannot be less than 1!");
        }
        
        return n * factorial(n-1);
    }
}