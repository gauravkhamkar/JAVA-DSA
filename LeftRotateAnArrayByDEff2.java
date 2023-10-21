import java.util.Arrays;
public class LeftRotateAnArrayByDEff2 {
    public static void reverse(int arr[], int low, int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void leftrotate(int arr[], int d)
    {
        int n=arr.length;
        reverse(arr, 0, d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int [] arr={1,2,3,4,5};
        leftrotate(arr, 2);
    }
}
