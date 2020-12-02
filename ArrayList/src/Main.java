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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\ArrayList\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            //get first line integer n
            int numOfLines = in.nextInt();

            //get first int in line
            ArrayList<int[]> arrayList = new ArrayList<>();

            //get array of ints
            for (int i = 0; i < numOfLines; i++) {
                int numOfInts = in.nextInt();
                int[] innerArray = new int[numOfInts];

                for (int j = 0; j < numOfInts; j++) {
                    innerArray[j] = in.nextInt();
                }

                arrayList.add(innerArray);
            }
            //get queries
            int numOfQueries = in.nextInt();

            for (int i = 0; i < numOfQueries; i++) {

                int line = in.nextInt();
                int position = in.nextInt();

                int[] arr = arrayList.get(line - 1);

                //print out each query with int or "ERROR!"
                try {
                    System.out.println(arr[position - 1]);
                }
                catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("ERROR!");
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
