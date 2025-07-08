public class PalinRangeNum 
{
    static boolean isPalin(int n)
    {
        int rev=0;
        int temp=n;
        while(temp>0)
        {
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        int min=10;
        int max=50;
        for(int i=min;i<=max;i++)
        {
            if(isPalin(i))
            System.out.println(i+ " ");
        }
    }
    
}
