public class gcdNum {
    public static int findGcd(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 3, n2 = 13;

        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
