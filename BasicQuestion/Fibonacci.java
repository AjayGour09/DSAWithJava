public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2); // add first and second value
    }

    public static void main(String[] args) {
        int n = 6; // tabcdake input
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result); // print and checked value
    }
}