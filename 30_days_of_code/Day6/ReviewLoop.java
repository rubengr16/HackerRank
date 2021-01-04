import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReviewLoop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        String[] S = new String[T];
        for (int i = 0; i < T; i++) {
            S[i] = scan.nextLine();
        }
        
        
        for (int i = 0; i < S.length; i++) {
            char [] c = S[i].toCharArray();
            for (int j = 0; j < c.length; j = j + 2) {
                System.out.print(c[j]);
            }
            System.out.print(" ");
            for (int j = 1; j < c.length; j = j + 2) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
}