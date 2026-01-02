/**Given an array of n size 
 * We have to find the element that apppears more than n/3 times.
 * Note when doing for n/2 there will be only one element that occur more than n/2 time so moories algo 
 * will work and henceforth it's in the easy section.
 */

 import java.util.*;

public class Majority_Element_2
{
    public int[] majority(int[] arr , int na)
    {
      int done[]=new int[arr.length] ;
      int c1=0 ,c2=0; 
    outer:
        for(int i = 0; i < arr.length; i++)
        {

            int c = 0 ;
            c=arr[i];

            
            for (int j = 0; j < done.length; j++)
            {
               if(done[j]==c1 || done[j]==c2)
               continue outer;   
            }

            int k=0;
            for (int j = 0; j < arr.length; j++)
            {
               if(arr[j]==c)
               k++;
            }
            if(k>3)
            {
               if(c1==0)
               c1=c;
               else
               c2=c;
            }
            for (int j = 0; j < done.length; j++)
            {
               done[j]=k ;
            }

        }

        return new int[]{c1,c2};   // FIXED
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the values in the array : ");
        for(int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        Majority_Element_2 obj = new Majority_Element_2();
        int result[] = obj.majority(a, n);

       for (int i : result) {
          System.out.println(i);
       } // FIXED

       in.close();
    }
}