public class checkSortedArray 
{
    public static boolean isSorted(int arr[], int len)
    {
        for(int i=1;i<len;i++)
        {
            if(arr[i] < arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};
        int len = 5;
        System.out.println(isSorted(arr, len));
    }
}
