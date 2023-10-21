public class leftRotateAnArraybyOne {
    static void  rotatebyone(int arr[])
    {
       int start=0; 
       int end = arr.length-1;
       while(start<end)
       {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        end--;
       }
       for(int i=0; i<arr.length; i++)
       {
        System.out.println(arr[i]);
       }


    }
    public static void main(String args[])
    {
        int [] arr = {1,2,3,4,5};
        rotatebyone(arr);
    }
}
