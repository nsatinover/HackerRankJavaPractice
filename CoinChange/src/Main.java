import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

//Scanner in = new Scanner(System.in);

class Result {

    public static long getWays(int money, List<Long> coins) {
        return makeChange(coins, money, 0, new HashMap<String, Long>());
    }

    private static long makeChange(List<Long> coins, int money, int index, HashMap<String, Long> memo) {
        if(money == 0){
            return 1;
        }
        if (index >= coins.size()){
            return 0;
        }

        String key = money + "-" + index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int amountWithCoin = 0;
        long ways = 0;

        while (amountWithCoin <= money){
            int remaining = money - amountWithCoin;
            ways += makeChange(coins, remaining, index + 1, memo);
            amountWithCoin += coins.get(index);
        }
        memo.put(key,ways);
        return ways;
    }

}
class Solution{
    private static Scanner in;

    public static void main(String []args) throws IOException {
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\CoinChange\\src\\input00.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = Result.getWays(n, c);

        System.out.println(ways);
//        bufferedWriter.write(String.valueOf(ways));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    } //main
} //Solution
