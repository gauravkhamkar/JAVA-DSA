import java.util.Arrays;
public class leftRotateAnArraybyD {
    static void leftrotate(int arr[])
    {
       int temp=arr[0];
       for(int i=1; i<arr.length; i++)
       {
        arr[i-1]=arr[i];
       }
       arr[arr.length-1]=temp;
    }
    static void rotate(int arr[], int d)
    {
        for(int i=0; i<d; i++)
        {
            leftrotate(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int [] arr= {1,2,3,4,5};
        rotate(arr, 2);

    }
}
