import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Gets from input a number n in a range of 2 to 20 inclusive and prints its 10 first multiples,
 * each multiple is n x i where i is in 1 to 10 inclusive.
 */
public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if ( 2 <= n && n <= 20) {  // n constraint, 2 <= n <= 20
            for(int i = 1; i < 11; i ++) {  // i constraint: 1 <= i <= 10, the same as: 1 <= i < 11
                System.out.println(n + " x " + i + " = " + n * i);  // Prints the multiplication and the multiple
            }
        }
        

        scanner.close();
    }
}