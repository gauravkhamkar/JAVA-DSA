public class chekifsorted2 {
    static boolean sorted(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int [] arr = {2,5,8,9};
        System.out.println(sorted(arr));
    }       

}
