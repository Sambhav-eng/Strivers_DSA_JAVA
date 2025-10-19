
/*Problem Statement-
 * In an Array of N integer return the number that is greater than N/2 and
 */
import java.util.*;

public class Array_Sort
{
    private static int[] Sort(int[] arr, int n)
    {
        int ch = n / 2 ;
        int fl = 0 ;

        for (int i = 0; i < n - 1; i++)
        {
            int it = 0 ;
            for ( int j = 0; j < n-1; j++ )
            {
                int fi = arr[0];
                if(arr[0] == arr[i+1])
                {
                    it++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int s[] = Sort(arr, n);
        System.out.print(s);

        in.close();
    }
}