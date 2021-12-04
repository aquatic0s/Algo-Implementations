import java.io.*;

class GFG {
    
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        //because we do not want 5th pass to happen at the last index number so n-1; 2nd last index max
        for(int i =0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                //we keep swapping and reducing swapping operation by 1 index each time
                if(arr[j] > arr[j+1]) //till at the end we want only 1 swap for 2 elements
                {
                    int temp = arr[j]; //this is the swapping operation
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
	public static void main (String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Before bubble sort");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("After bubble sort");
		printArray(arr);
	}
}
