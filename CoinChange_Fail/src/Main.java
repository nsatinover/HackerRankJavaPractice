import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

//Scanner in = new Scanner(System.in);

class Result {

    public static long getWays(int n, List<Long> c) {
        //return value
        int waysToMakeChange = 0;

        //store solutions to change
        List<ArrayList<Long>> solutions = new ArrayList<>();

        //sort smallest to largest values of coins
        c.sort(Comparator.naturalOrder());

        //start at smallest coin value
        for (int i = 0; i < c.size(); i++) {
            //get first value
            long coin = c.get(i);


            //check if this value if >, ==, < n 'change'
            if (coin > n){
                break;
            }
            else if(coin == n){
                waysToMakeChange++;
                break;
            }
            else {
                //first coin is < change, get another coin smallest to largest
                for (int j = 0; j < c.size(); j++) {
                    //create changeList
                    ArrayList<Long> changeList = new ArrayList<>();

                    //start sum w/ first coin and add to list of current coins
                    long sum = coin;
                    changeList.add(coin);

                    while (sum < n) { //sum of coins < n 'change' keep adding coins
                        long nextCoin = c.get(j);
                        sum += nextCoin;
                        changeList.add(nextCoin);

                        //check if this value if >, ==, < n 'change'
                        if (sum > n){
                            break;
                        }
                        else if(sum == n){

                            //check if this combo already exists as a solution
                            changeList.sort(Comparator.naturalOrder());
                            if (solutions.size() == 0){
                                solutions.add(changeList);
                                waysToMakeChange++;
                            }
                            else {
                                boolean isDup = false;
                                for (ArrayList arr: solutions) {
                                    isDup = changeList.equals(arr);
                                    if (isDup) {
                                        break;
                                    }
                                }
                                if(!isDup) {
                                    solutions.add(changeList);
                                    waysToMakeChange++;
//                                    sum-= changeList.get(changeList.size() - 1);
//                                    changeList.remove(changeList.size() - 1);
//                                    sum-= changeList.get(changeList.size() - 1);
//                                    changeList.remove(changeList.size() - 1);
//                                    j++;
                                }
                            }

                        }

                    }
                }
            }

        }

        return waysToMakeChange;
    }

}
class Solution{
    private static Scanner in;

    public static void main(String []args) throws IOException {
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\CoinChange\\src\\input01.txt";
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
