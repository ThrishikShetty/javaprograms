//1. Sort a given set of n integer elements using Selection Sort method and compute its time
//        complexity. Run the program for varied values of n> 5000 and record the time taken to sort.
//        Plot a graph of the time taken versus n. The elements can be read from a file or can be
//        generated using the random number generator. Demonstrate using C++/Java how the brute
//        force method works along with its time complexity analysis: worst case, average case and best
//        case.



import java.util.Random;
import java.util.Scanner;
public class selectionSort{
    public static void run(int array[]) {
        for (int i = 0; i<array.length - 1; i++)
        { int min = i;

            for (int j = i + 1; j< array.length; j++)
            { if (array[j] < array[min]) {
                min = j;
            }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args)
    {
        int n,i;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the value for n");
        n = s.nextInt();
        int a[] = new int[n];

        for (i = 0; i< n; i++) {
            a[i] = r.nextInt(1000);
        }
        System.out.println("The array elements before sorting");
        for (i = 0; i<n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        long st = System.currentTimeMillis();
        run(a);
        long et = System.currentTimeMillis();
        long total = et - st;
        System.out.println("The array elements after sorting");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
        System.out.println("Total time taken=" + total + "ms");

    }
}
