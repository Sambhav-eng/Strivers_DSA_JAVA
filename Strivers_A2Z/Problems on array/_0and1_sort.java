    /*We have been given an array which contains 
    * only 0 or 1 or 2
    * sort this array in non decreasing order.
    * ex - [0,0,1,1,1,2,2,2] etc.
    */

    import java.util.*;
    public class _0and1_sort
    {

        public static void sort(int[] nums ,int  s)
        {
            int z=0 , o =0, t =0;

            //Value of xot will get stored after final iteration 
            for (int i = 0; i < nums.length; i++)
            {
                    if(nums[i] == 0) 
                    {
                        z++;
                    }

                    
                    if(nums[i] == 1) 
                    {
                        o++;
                    }

                    
                    if(nums[i] == 2) 
                    {
                        t++;
                    }
            }
            int f = z+o+t;

            int last[]=new int[f];
            int zero[] = new int[z];
            int one[] = new int[o];
            int two[] = new int[t];


            for (int i = 0; i < z; i++)
            {
                zero[i]=0;    
            }
            
            for (int i = 0; i < o; i++)
            {
                one[i]=1;    
            }
            
            for (int i = 0; i < t; i++)
            {
                two[i]=2;    
            }


            //comvbining all three array into one single array first zero than one tham two's array 
            for (int i = 0; i < z; i++) {
                last[i]=zero[i];
            }

            for (int j = 0; j < o ; j++) {
                last[z+j]=one[j];
            }

            int hu=z+o;
            for(int k = 0 ; k < t ; k++)
            {
                last[hu+k]=two[k];
            }


            System.out.println("The array is : ");
            for (int i = 0; i < f; i++) {
                System.out.print(last[i]);
            }
        }
        public static void main(String[] args)
        {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter the size of array : ");
            int n = in.nextInt();

            int[] arr= new int[n];
            System.out.println("Enter the value in array : ");
            for (int i = 0; i < n; i++)
            {
                arr[i]=in.nextInt();
            }
            
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]<0 || arr[i]>2)
                {
                    System.out.println("Entered value in array exceeds 2 ");
                    System.exit(404);
                }    
            }

            sort(arr,n);
            in.close();
        }
    
    }