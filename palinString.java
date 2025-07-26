import java.util.*;
public class palinString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str, rev="";
        char ch;
        System.out.println("Enter a String");
        str=sc.nextLine();
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--)
        {
            ch=str.charAt(i);
            rev=rev+ch;
        }
        if(rev.equals(str))
        System.out.println("It's Palindrome String");
        else
        System.out.println("Not Palindrome String");
    }
    
}
