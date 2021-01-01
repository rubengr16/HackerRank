import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Given by input a meal_cost, a tip_percent and a tax_percent compulsory. Obtain the total_cost of the meal.
 */
public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (tip_percent / 100d) * meal_cost;  // 100d is necessary to not divide and obtain an int result
        double tax = (tax_percent / 100d) * meal_cost;
        int total_cost = (int)Math.round(meal_cost + tip + tax);  // total_cost calculation
        System.out.println(total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
