import java.util.Scanner;

public class Subarray
{
    public static int Sum(int ar[],int number)
    {
         int count = 0;

        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = i; j < ar.length; j++)
            {
                sum += ar[j];
                if (sum == number) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the length of array : ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in array : ");
        for (int index = 0; index < n; index++) {
            arr[index]=in.nextInt();
        }

        System.out.println("Enter the valeu of k : ");
        int k = in.nextInt();

        int no = Sum(arr,k);
        System.out.println("No. of Subarray : "+no);
        in.close();
    }
}
