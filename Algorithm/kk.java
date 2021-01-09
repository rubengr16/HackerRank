import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < customers.size(); i ++) {
            if (map.containsKey(customers.get(i))) {
                map.put(customers.get(i), map.get(customers.get(i)) + 1); 
            } else {
                map.put(customers.get(i), map.get(customers.get(i)));
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < customers.size(); i++) {
            if (map.containsKey(customers.get(i))){
                if (map.get(customers.get(i)) / customers.size() >= 5) {
                    list.add(map.)
                }
            }
        }
        return null;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = new ArrayList<>();

        for (int i = 0; i < customersCount; i++) {
            String customersItem = bufferedReader.readLine();
            customers.add(customersItem);
        }

        List<String> result = Result.mostActive(customers);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

