import java.io.*;
import java.util.*;


class GFG {

    static int search(int[] arr, int x)
    {
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == x)
                return i;
        }

        return -1;
    }
    public static void main (String[] args) {
       
     int[] arr = {10, 50, 30, 70, 80, 60, 20, 90, 40};
     int x  = 20;

     int result = search(arr, x);

     if(result == -1)
     {
        System.out.println("Element is not present in array");
     }
     else
     {
        System.out.println("Element is present at index "+ result);
     }
    }
}
