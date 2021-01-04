import java.io.*;
import java.util.*;

public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     * Given an array, return the value of adding each of the elements
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for(int i =  0; i < ar.length; i ++) {
            sum += ar[i];  // Adds the elements
        }
        return sum;
    }

    // Scanner creation
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // Reads from input the array's size
        int arCount = Integer.parseInt(scanner.nextLine().trim());
        // Creates the array with the given size
        int[] ar = new int[arCount];
        // Reads the values separated by an space (" ")
        String[] arItems = scanner.nextLine().split(" ");
        // Set the values on their position
        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }
        // simpleArraySum call
        int result = simpleArraySum(ar);

        System.out.println(result);

    }
}