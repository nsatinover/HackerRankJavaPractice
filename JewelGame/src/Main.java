import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.nio.charset.StandardCharsets;

class Result {

    /*
     * Complete the 'getMaxScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING jewels as parameter.
     */

    public static int getMaxScore(String jewels) {
        // Write your code here
        int score = 0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(jewels.split("")));

        boolean foundMatch;
        do{
            foundMatch = false;

            for (int i = 0; i < list.size() - 1; i++) {
                String current = list.get(i);
                String next = list.get(i + 1);

                if (current.equals(next)){
                    list.remove(i);
                    list.remove(i);
                    score++;
                    foundMatch = true;
                    if (i >= 3){
                        i -= 3;
                    }
                    else {
                        i = 0;
                    }
                }
            }
        }while (foundMatch == true);


        return score;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\JewelGame\\src\\input00.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String jewels = bufferedReader.readLine();

                int ans = Result.getMaxScore(jewels);

//                bufferedWriter.write(String.valueOf(ans));
//                bufferedWriter.newLine();
                System.out.println(String.valueOf(ans));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

