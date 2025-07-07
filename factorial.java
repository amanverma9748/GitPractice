public class factorial {

    // Function to calculate factorial of a number
    public static int factorial(int X) {
        int ans = 1;

        // Loop from 1 to X to compute factorial
        for (int i = 1; i <= X; i++) {
            ans = ans * i;
        }

        // Return the final result
        return ans;
    }

    public static void main(String[] args) {
        // Input value for which factorial is to be calculated
        int X = 5;

        // Call the factorial function and store the result
        int result = factorial(X);

        // Print the result
        System.out.println("The factorial of " + X + " is " + result);
    }
}