import java.util.*;

public class _2Sum {
    private static boolean check(int[] array, int s, int tar) {
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s - 1; j++) {
                int var = array[i] + array[j];
                if (var == tar) {
                    return true;

                }
            }
        }
        return false;
    }

    private static int[] Sum(int[] array, int s, int tar) {
        _2Sum obj = new _2Sum();
        if (obj.check(array, s, tar) == false) {
            return new int[] { -1, -1 };
        } else {
            for (int i = 0; i < s - 1; i++) {
                for (int j = 0; j < s - 1; j++) {
                    int var = array[i] + array[j];
                    if (var == tar) {
                        return new int[] { i, j };

                    }
                }
            }
        }
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

        System.out.println("Enter the Target Element  : ");
        int t = in.nextInt();

        int arr1[] = Sum(arr, n, t);
        System.out.println(
                "Array after Left Rotation is : " + Arrays.toString(arr1));

                in.close();
    }
}