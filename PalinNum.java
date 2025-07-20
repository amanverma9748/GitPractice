public class palinNum 
{
    public static void main(String[] args) 
    {
    int n=122122;
    int temp=n;
    int rev=0;

    while(temp>0)
    {
        int rem=temp%10;
        rev=(rev*10)+rem;
        temp=temp/10;
    }
    if(rev==n)
    System.out.println("It's Palindrome Number");
    else
    System.out.println("Not a Palindrome Number");
    }
}

