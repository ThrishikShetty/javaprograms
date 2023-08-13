//1. Sort a given set of n integer elements using Selection Sort method and compute its time
//        complexity. Run the program for varied values of n> 5000 and record the time taken to sort.
//        Plot a graph of the time taken versus n. The elements can be read from a file or can be
//        generated using the random number generator. Demonstrate using C++/Java how the brute
//        force method works along with its time complexity analysis: worst case, average case and best
//        case.



import java.io.*;
public class selectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    // Driver code to test above
    public static void main(String args[])
    {
        selectionSort ob = new selectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
