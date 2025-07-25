public class MaxSubarray
{
    public static int maxSub(int[] arr)
    {
        int sum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>maxSum)
            {
                maxSum=sum;
            }
            // if(sum<0)
            // {
            // sum=0;
            // }
        }
    return maxSum;
    }
    public static void main(String[] args) 
    {
        int[] arr={-2,-3,8};
        System.out.println(maxSub(arr));
        
    }
}
