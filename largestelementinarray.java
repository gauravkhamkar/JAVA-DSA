public class largestelementinarray {
    static int largest(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            boolean flag =true;
            for(int j=0; j<n; j++)
            {
                if(arr[j]>arr[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag == true)
            {
                return arr[i];
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
        int [] arr={5,8,20,10};
        System.out.println(largest(arr));
    }
}
