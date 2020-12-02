import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\SubArray\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            int arrLength = in.nextInt();
            int[] arr = new int[arrLength];

            for (int i = 0; i < arrLength; i++) {
                arr[i] = in.nextInt();
            }

            int countNeg = 0;

            // set starting point 'i'
            for (int i = 0; i < arrLength; i++) {

                //set ending point 'j'
                for (int j = i; j < arrLength; j++) {

                    int sum = 0;
                    // sum subarray between current starting at 'i' and ending at 'j'
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }

                    if (sum < 0){
                        countNeg++;
                    }
                }

            }

            System.out.println(countNeg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
