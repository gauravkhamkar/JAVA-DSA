public class KthLargestElement {
    static void getLargest(int arr[], int k)
    {
        int res = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>arr[res])
            {
                res = i;
            }
        }
        int result = -1;
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]!=arr[res])
            {
                 if(result==-1)
                 {
                    res=j;
                 }
                 else if(arr[j]>arr[result])
                 {
                    result=j;
                 }
            }
        }
        
    }

    
}
