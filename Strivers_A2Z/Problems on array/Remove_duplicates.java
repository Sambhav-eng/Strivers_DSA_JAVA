
//Removing duplicate elements from an array.
import java.util.*;

public class Remove_duplicates {

    private static int Dup(int [] array,int n )
    {
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j =1; j < array.length-1; j++)
            {
                if(array[i]==array[j])
                {
                    int num = array[i];
                    return num ;
                }
            } 
        }
        return 0;
        
    }
    
   /*  private static int[] Duplicate(int [] array,int n )
    {
        int flag[] = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            flag[i]=   
        }

        /*
        int flag[] = new int[n];
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j =1; j < array.length-1; j++)
            {
                if(array[i]==array[j])
                return arr[]
          
                for (int j2 = 0; j2 < j; j2++)
                {
                    flag[j2]=array[i];
                }
            }
        }
        return flag;
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        //int s[] = Duplicate(arr, n);
        int s1 = Dup(arr, n);

        System.out.println("\nArray of Duplicate Elemensts is : ");
        System.out.println(s1);

        in.close();
    }
}