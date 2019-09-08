package com.codingblocks;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'rotateTheString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING originalString
     *  2. INTEGER_ARRAY direction
     *  3. INTEGER_ARRAY amount
     */

    public static String rotateTheString(String originalString, List<Integer> direction, List<Integer> amount) {
        // Write your code here
        for (int i = 0; i < direction.size(); i++) {
            if (direction.get(i) == 0) {
                // left rotate
                originalString = originalString.substring(amount.get(i)) + originalString.substring(0, amount.get(i));
            }
            if (direction.get(i) == 1) {
                // right rotate
                originalString = originalString.substring(originalString.length() - amount.get(i)) + originalString.substring(0, originalString.length() - amount.get(i));
            }
        }
        return originalString;
    }

}

public class RotateString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String originalString = bufferedReader.readLine();

        int directionCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> direction = IntStream.range(0, directionCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int amountCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> amount = IntStream.range(0, amountCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        String result = MazeRule.rotateTheString(originalString, direction, amount);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
