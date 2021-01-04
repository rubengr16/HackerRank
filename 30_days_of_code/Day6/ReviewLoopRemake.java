import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReviewLoopRemake {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        String[] S = new String[T];
        for (int i = 0; i < T; i++) {
            S[i] = scan.nextLine();
        }
        
        
        for (int t = 0; t < T; t++) {
            char [] c = S[t].toCharArray();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j + i < c.length; j = j + 2) {
                System.out.print(c[j + i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
