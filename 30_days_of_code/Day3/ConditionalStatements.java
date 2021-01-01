import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Get a number (int) from input and print "Weird" if the number is odd, 
 * "Not Weird" if the number is even lower than 6, "Weird" if the number is even and between 6 and 20,
 * and "Not Weird" if it is even greater than 20.
 */ 
public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 == 1 || (6 <= N && N <= 20))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

        scanner.close();
    }
}