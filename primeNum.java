import java.util.*;

class primeNum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        String res = "";

        System.out.println("Enter any number to check Prime:");
        num = sc.nextInt();

        if (num < 2) {
            res = "Not a Prime";
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break; // stop checking further
                }
            }
            res = flag ? "It's a Prime" : "Not a Prime";
        }

        System.out.println(res);
    }
}