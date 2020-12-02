import java.util.*;
import java.io.*;
import java.util.Scanner;

//Scanner in = new Scanner(System.in); -- replace try/catch with in HackerRank

class Result{

    public static int getLargest(int[][] arr) {
        int largest = Integer.MIN_VALUE;

        // loop through 2D Array with boundaries set to only capture hour glass
        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = 0; j < arr.length - 2; j++) {
                int hourglass = 0;

                hourglass =
                    arr[i][j]   + arr[i][j+1]   + arr[i][j+2] +
                                  arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                largest = hourglass > largest ? hourglass : largest;
            }

        }
        return largest;
    }

}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\TwoDArray\\src\\input\\input01.txt";
        File input = new File(filePath);

        try (Scanner scanner = new Scanner(input)) {

            int[][] arr = new int[6][6];

            //get 2D Array
            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            int largest = Result.getLargest(arr);

            System.out.println(largest);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
