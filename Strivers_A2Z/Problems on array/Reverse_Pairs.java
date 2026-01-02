//Reverse Pair

import java.util.*;
public class Reverse_Pairs
  {
    
    public static int Spiral(int[] arr)
    {
      int update =0 ;
      int n = 1;
      for(int i = 0 ; i < arr.length ; i ++)
        {
          for(int j = i+1 ; j < arr.length-1; j ++)
            {
               
              n = 2*arr[j];
              if(arr[i] > n)
              update ++ ;
            }
        }
      return update ;
    }
    
    public static void main ( String args [])
    {
      Scanner in = new Scanner ( System.in );
      System.out.println ( "Enter the size of the array" );
      int n = in.nextInt ();
      int a [] = new int [n];
       System.out.println("Enter the elements");
      for (int i = 0 ; i < n ; i ++)
        {
          a[i] = in.nextInt();
        }
      
      int k = Spiral(a);
      System.out.println(k);
      in.close();
    }
   
  }
