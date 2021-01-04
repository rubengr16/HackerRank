import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * Reads a number T from input in an inclusive range of 1 to 10,
 * later scans T lines from input each S in a subsequent line,
 * S must have a length in an inclusive range of 2 to 10000.
 * Once read the T strings, each one must be printed with the characters on the even positions on the left,
 * separated by a space (" ") and on the right the odd ones.
 */
public class ReviewLoop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Reads T, number of lines which will be entered
        if (1 <= T && T <= 10){  // Constraint 1 <= T <= 10
            scanner.nextLine();  // Skips the end of the line where T was introduced
            String[] S = new String[T];  // String array for saving the lines
            for (int i = 0; i < T; i++) {  // Reading of lines
                S[i] = scanner.nextLine();
            }
            
            
            for (int i = 0; i < T; i++) {  // The loop will iterate T times
                char [] c = S[i].toCharArray();
                if (2 <= c.length && c.length <= 10000){  // Constraint 2 <= S <= 10000
                    for (int j = 0; j < c.length; j = j + 2) {  // Odd positions
                        System.out.print(c[j]);
                    }
                    System.out.print(" ");  // Separator between even and odd positions
                    for (int j = 1; j < c.length; j = j + 2) {  // Even positions
                        System.out.print(c[j]);
                    }
                    System.out.println();  // Line separator
                }
            }
        }
        scanner.close();
    }
}