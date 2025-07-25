public class freqElementArray 
{
    public static int freq(int num, int[] arr)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                c=c+1;
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,1,5,1,2,2,2,3};
        int num=5;
        System.err.println(freq(num,arr));
    }
}
