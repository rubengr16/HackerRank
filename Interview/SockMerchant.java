import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        boolean constraint = false;
        int match = 0;
        if (1 <= n && n <= 100) {
            int[] array = new int[100];
            for (int i = 0; i < n && !constraint; i++) {
                if (1 <= ar[i] && ar[i] <= 100) {
                    array[ar[i]-1] += 1; 
                } else {
                    constraint = true;
                }
            }
            if (!constraint) {
                for (int i = 0; i < array.length; i++) {
                    match += array[i]/2;
                }
            }
        } else {
            constraint = true;
        }
        return constraint ? -1 : match;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}