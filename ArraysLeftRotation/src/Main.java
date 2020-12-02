import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;

//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src
//Scanner in = new Scanner(System.in);


class Solution{
    static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];

        int arrPos = 0;
        for (int i = d; i < a.length; i++) {
            arr[arrPos] = a[i];
            arrPos++;
        }
        for (int i = 0; i < d; i++) {
            arr[arrPos] = a[i];
            arrPos++;
        }
        return arr;
    }

    public static void main(String []args) throws FileNotFoundException {

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\ArraysLeftRotation\\src\\input00.txt";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        File input = new File(filePath);

        try (Scanner scanner = new Scanner(input)) {
            String[] nd = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nd[0]);

            int d = Integer.parseInt(nd[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            int[] result = rotLeft(a, d);

            for (int i = 0; i < result.length; i++) {
                System.out.print(String.valueOf(result[i]));
                //                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    System.out.println(" ");
//                    bufferedWriter.write(" ");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
