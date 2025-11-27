    import java.util.*;
    public class Rotating
    {

        private static int[] check(int[] arr , int t)
        {
            //Checking if the sum of two numbers = target ?
            Scanner in = new Scanner(System.in);
            System.out.println("Enter right or left : ");
            String s = in.nextLine(); 
            System.out.println("Enter the value of k : ");
            int k = in.nextInt();
            for (int i = 0; i < arr.length; i++)
            {

            }
           return 0 ;
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter the length of array : ");
            int n=in.nextInt();
            
            int arr[]=new int[n];
            System.out.println("Enter the value in the array : ");
            for(int i = 0; i < n ; i ++)
            {
                arr[i]=in.nextInt();
            }

            int a[]=check(arr, n);
            System.out.println();
            for (int i = 0; i < a.length; i++)
            {
                System.out.println(a[i]);
            }
        }
    }