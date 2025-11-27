/**Given an array of n size 
 * We have to find the element that apppears more than n/2 times.
 */

 import java.util.*;
 public class Majority_Element
 {

   public int majority(int[] num , int na)
   {
     
      double parameter = na /2.0 ;
      for (int i = 0; i < num.length; i++)
      {
         int u = 0 ;
         int f= num[i];
         for (int j = 0; j < num.length; j++)
         {
            if(f==num[j])
            {
               u ++ ;
            }
         }
         if(u>parameter)
         {
            System.out.println("Majority Element is : ");
            return f;
         }
      }
      return 256;
   }
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Enter the value of n : " );
      int n = in.nextInt(); 

      int arr[] = new int[n];


      System.out.println("Enter the valeru in the array : ");
      for (int i = 0; i < arr.length; i++) {
         arr[i]=in.nextInt();
      }

      Majority_Element obj =  new Majority_Element();
      int a = obj.majority(arr, n );
      System.out.println(a);
    }
 }