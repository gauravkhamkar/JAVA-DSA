public class largestelementinarray2 {
    static int getlargest(int arr[])
    {
        int res = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>arr[res])
            arr[res]=arr[i];
        }
        return arr[res];
    }
    public static void main(String args[])
    {
        int [] arr = {1,3,5,2};
        System.out.println(getlargest(arr));
    }
}
