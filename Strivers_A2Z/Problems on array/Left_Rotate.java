import java.util.*;

public class Left_Rotate {
    private static int[] Rotate(int[] array, int s)
    {
     int temp = array[0];
        for (int i = 0; i < array.length-1; i++)
        {
            array[i]=array[i+1];
        }
        array[s-1]=temp;
        return array;
       
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

        int arr1[] = Rotate(arr, n);
        System.out.println(
            "Array after Left Rotation is : " + Arrays.toString(arr1)
        );
    }
}