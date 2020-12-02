import java.io.*;
import java.math.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxXorValue' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING x
     *  2. INTEGER k
     */

    public static String maxXorValue(String x, int k) {
        StringBuilder builder = new StringBuilder();

        //split bitSet input into array
        ArrayList<String> xSplit = new ArrayList<String>(Arrays.asList(x.split("")));

        //iterate through each bitSet and change values until end of bitSet or return set is changed 'k' times
        int setBits = 0;
        for (String s : xSplit) {
            if (setBits < k){
                if (s.equals("0")){
                    builder.append("1");
                    setBits++;
                }
                else {
                    builder.append("0");
                }
            }
            else {
                builder.append("0");
            }
        }

        return String.valueOf(builder);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\XORProblem\\src\\input00.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                int k = Integer.parseInt(bufferedReader.readLine().trim());

                String y = Result.maxXorValue(s, k);

                System.out.println(y);
//                bufferedWriter.write(y);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
