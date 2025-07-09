public class factorsNum {
     static void Divisor(int n)
        {
            for (int i=1;i<=Math.sqrt(n); i++)
            {  
                if (n%i==0)
                {
                    // If divisors are equal, print only one
                    if (n/i == i)
                        System.out.print(" "+ i);
         
                    else // Otherwise print both
                        System.out.print(i+" " + n/i + " " );
                } 
            }
        }
        public static void main(String args[])
        {   int n = 9;
            System.out.print("Factors of " + n + " are: ");
            Divisor(n);;
        }
}