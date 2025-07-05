public class removeDuplicateArr {
    
    static int removeD(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
       int arr[] = {1,1,2,4,2,3,3};
        int rec = removeD(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < rec; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}