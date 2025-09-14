    //To check whether the array is sorted in ascendig order or not.
import java.util.*;
public class Array_Sort
{
   private static boolean Sort(int[] arr, int n)
   {
       for (int i = 0; i < arr.length-1; i++)
       {
        if(arr[i]>arr[i+1])
        return false; 
       }
       return true;
   }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int n = in.nextInt();
        int arr[]= new int[n] ;
        
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        
       boolean s = Sort(arr,n);
       System.out.print(s);
    }
}