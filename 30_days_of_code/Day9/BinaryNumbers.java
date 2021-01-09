import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if (1 <= n && n <= Math.pow(10, 6)) {
            List<Integer> l = new LinkedList<>();
            int i = 0;
            while (n > 0) {
                l.add(n % 2);
                n /= 2;
                i++;
            }
            
            i = 0;
            int max = 0;
            while (!l.isEmpty()) {
                if (l.remove(l.size() - 1) == 1) {
                    i++;

                } else {
                    i = 0;
                }
                if (max < i) {
                    max = i;
                }
            }
            
            System.out.println(max);
        }
    }
}
