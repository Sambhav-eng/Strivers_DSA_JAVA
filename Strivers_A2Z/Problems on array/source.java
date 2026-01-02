    import java.util.*;
    public class source
    {

        private static boolean check(int[] arr , int t)
        {
            //Checking if the sum of two numbers = target ?

            for (int i = 0; i < arr.length; i++)
            {
            for (int j = 0; j < arr.length; j++)
            {
                if((arr[i]+arr[j])==t)
                return true;   
            }   
            }
            return false ;
        }

        private static int[] comp(int arr[], int t)
        {
            while(check(arr,t))
            {
                for (int i = 0; i < arr.length; i++)
                {
                    for (int j = 1; j < arr.length; j++) {
                        if((arr[i]+arr[j])==t)
                        {
                            return new int[]{i,j};
                        }
                    }
                }
            }

            int[] flagarr = {-1,-1};
            return flagarr;
        }
        
        
        public static void main(String[] args)
        {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter the target Element : ");
            int tar=in.nextInt();
            System.out.println("Enter the size : ");
            int n = in.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements : ");
            for (int i = 0; i < n; i++)
            {
                arr[i]=in.nextInt();
            }

            boolean chk1 = check(arr,tar);
            System.out.println(chk1);
            if(chk1==false)
            {
            System.out.println("NO");
            }
            else
            System.out.println("YES");
            int a[]=comp(arr, tar);    
            System.out.println(Arrays.toString(a));
            in.close();
        }
    }