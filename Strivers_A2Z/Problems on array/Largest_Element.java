import java.util.*;

public class Largest_Element 
{
    public static void printarray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++)
        {  // Fix here: loop up to n
            a[i] = in.nextInt();
        }

        printarray(a);
        in.close();
    }
}
