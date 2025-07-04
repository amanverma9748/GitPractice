class checkSort
{
    public static void main(String[] args)
    {
        int arr[]={1,2,2,3,4,4,4,8,6};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else
            System.out.println("Array not sorted");

        }
        System.out.println("Array is sorted");     
    }
}
