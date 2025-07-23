public class recursionPow 
{
    public static void main(String[] args) { 
    int num=3;
    int pow=2;

    System.out.println(power(num, pow));
    }
    static int power(int num, int pow)
    {
        //base case
        if(pow==0)
        return 1;
        else
        return (num*power(num, pow-1));
    }
    
}
