import java.util.*;

public class Rotate_D_Elements {
    private static int[] Rotate(int[] array, int s, int k, int ch)

    {
        /*
         * s= size of array.
         * k = number of roation.
         * ch = check for left or right.
         */
        int a =0 ;
            if (k < s) {

                if (ch == 1) {
                    //Left rotate
                    for (int i = 0; i <= k; i++)
                    {
                        for (int j = 0; j < s-1 ; j++) { //array-looping
                        if(j==0)
                          a = array[j];
                        
                        array[j]=array[j+1];

                        if(j==s-1)
                          array[s-1]=a;
                        }
                    }

                }
            }

            return array ;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nk is the number of elements required for rotation.");

        System.out.println("Enter the size of k :");
        int k = in.nextInt();

        System.out.println("Enter Left rotate or right rotate : ");
        String rot = in.next();
        int check;
        if (rot.equals("left"))
            check = 1;
        else
            check = 0;

        System.out.println("Enter the size of array  : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int arr1[] = Rotate(arr, n, k, check);
        System.out.println(
                "Array after Left Rotation is : " + Arrays.toString(arr1));
                in.close();
    }
}