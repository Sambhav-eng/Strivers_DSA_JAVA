// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Sorting
{
    private static int[] Sort(int a[],int s)
    {
        int n =0 ;
        int p =0 ;
        for(int i = 0 ; i <n-1; i++)
        {
            if(a[i]<0)
            {
                n++;
            }
            else
            p++;
        }
        
        if(n!=p)
        {
            System.out.println("Number of positive should be equal to number of negative ");
            return new int[]{0,0,0};
        }
        int pos[] = new int[n];
        int neg[] = new int[n];
        for ( int i = 0 ; i < n-1 ; i ++)
        {
            if(a[i]>0)
            pos[i]=a[i];
            
            else
            neg[i]=a[i];
        }
        
        int cpos = 0;
        for (int num : pos) {
            if (num != 0) {
                cpos++;
            }
        }
        int[] result = new int[cpos];
        int index = 0;
        for (int num : pos) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        //result is the array with only positive value
        

int cneg = 0;
        for (int num : neg) {
            if (num != 0) {
                cneg++;
            }
        }

        int[] result2 = new int[cneg];
        int index2 = 0;
        for (int num : pos) {
            if (num != 0) {
                result2[index2++] = num;  //result is the array with only negative value
            }
        }

        int b = pos.length+neg.length;

        int merged[] = new int[b] ;
        int index1 = 0;
        for (int i = 0; i < n-1; i++)
        {
            merged[index1++] = pos[i]; // add + value
            merged[index1++] = neg[i]; // add - value
        }

        return merged ; 

    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0 ; i <n-1 ; i ++)
        {
            arr[i]=in.nextInt();
        }
        int[] sortedArr = Sort(arr, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < sortedArr.length-1; i++)
        {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println(); // For a new line after printing all elements

        in.close();
    }
}