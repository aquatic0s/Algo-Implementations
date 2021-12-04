import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    //note we can call static method from other methods directly
    static int binarysearch(int[] arr, int l, int r, int x)
    {
        if(r >= l)
        {
            int mid = l + (r - l) / 2; //this was the mistake it was l + (r - l) / 2
            
            if(arr[mid] == x)
            {
                return mid;
            }
            
            if(arr[mid] > x)
            {
                return binarysearch(arr, l, mid - 1, x);
            }
            
            return binarysearch(arr, mid + 1, r, x);
        }
        
        return -1;
    }
	public static void main (String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int n = arr.length;
		int x = 23;
		int result = binarysearch(arr, 0, n-1, x);
		if(result == -1){
		    System.out.println("This number does not exist in the array!");
		}
		else{
		    System.out.println("The number is present at the index: "+ result);
		}
	}
}
