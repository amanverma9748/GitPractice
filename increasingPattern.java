//Basic Pattern 1
public class increasingPattern 
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.err.print("* ");
            }
            System.err.println();

        }
    }    
}
