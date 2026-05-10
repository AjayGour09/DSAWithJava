public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) // initionlize the condition
            return n;
        return fib(n - 1) + fib(n - 2); // add first and second values
    }

    public static void main(String[] args) { // funcation 
        int n = 6; // tabcdake input
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result); // print and checked value
    }
}