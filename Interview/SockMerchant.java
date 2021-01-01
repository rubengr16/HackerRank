import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Given by input the size of an array and later the elements (numbers) of the array separated by " ",
 * create a function (sockMerchant) that determines how many pairs of numbers the array has.
 * Constraint: array's size must be in an inclusive range of 1 and 100 
 * as well as the values of the array.
 */
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        boolean constraint = false;
        int match = 0;
        if (1 <= n && n <= 100) {  // Size between 1 and 100 included
            int[] array = new int[100];
            for (int i = 0; i < n && !constraint; i++) {
                if (1 <= ar[i] && ar[i] <= 100) {  // Values of elements between 1 and 100 included
                    array[ar[i]-1] += 1;  // Adds each value on their possition to have a registry of the number's appearance
                } else {
                    constraint = true;
                }
            }
            if (!constraint) {
                for (int i = 0; i < array.length; i++) {
                    match += array[i]/2;  // Counts each pair dividing by 2 the value's appearance
                }
            }
        } else {
            constraint = true;
        }
        return constraint ? -1 : match;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");  // Establishes a separator between values
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);  // Reads one by one values
            ar[i] = arItem;  // Sets values
        }
        // sockMerchant call
        int result = sockMerchant(n, ar);
        // Print result
        System.out.println("There are " + result + " pairs.");
        scanner.close();
    }
}