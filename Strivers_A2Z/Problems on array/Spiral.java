//Spiral matrix
import java.util.*;
public class Main
  {

    public static int[] Spiral(int[][] arr , int a , int b)
    {

      int k[]=new int[a*b];
      int bottom = a-1,right = b-1;
      int l=0,t=0;

      int index=0;

      
      while(t<=bottom && l<=right)
        {
          for(int i = l; i<=right;i++)
            {
              k[index++]=arr[t][i];
            }
          t++ ;

          for(int i = t; i <=bottom;i++)
            {
              k[index++]=arr[i][right];
            }
          right--;

          if(t<=bottom)
          {
            for(int i = right; i >= l ; i--)
              {
                k[index++]=arr[bottom][i];
              }
            bottom--;
          }

          if(l <= right)
            {
                for(int i = bottom; i >= t; i--)
                {
                    k[index++] = arr[i][l];
                }
                l++;
            }
        }

      return k ;
    }
    
    public static void main ( String args [])
    {
      Scanner in = new Scanner ( System.in );
      System.out.println("Enter the number of rows and columns");
      int n = in.nextInt ();
      int m = in.nextInt ();
      int a[][] = new int[n][m];
      System.out.println("Enter the elements");

      for (int i = 0 ; i < n ; i ++)
        {
          for (int j = 0 ; j < m ; j ++)
            {
              a[i][j] = in.nextInt ();
            }
        }
      int array[] = Spiral(a , n,m);

      System.out.println();
      for(int i = 0 ; i < array.length ; i ++ )
        {
         
          System.out.print(array[i]);
        }
    }
  }
