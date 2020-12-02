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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\List\\src\\input\\input03.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            //get list length
            int arrLength = in.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();

            //add int elements to list
            for (int i = 0; i < arrLength; i++) {
                arr.add(in.nextInt());
            }

            //perform queries
            int numOfQueries = in.nextInt();
            for (int i = 0; i < numOfQueries; i++) {
                in.nextLine();
                String command = in.nextLine();
                if (command.equals("Insert")){
                    int index = in.nextInt();
                    int value = in.nextInt();
                    arr.add(index, value);
                }
                if (command.equals("Delete")){
                    int index = in.nextInt();
                    arr.remove(index);
                }
            }

            for (Integer i: arr) {
                System.out.print(i + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
