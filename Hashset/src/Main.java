import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Hashset\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner s = new Scanner(input)) {

            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

            Set<String> set = new HashSet<>();

            int count = 0;
            for (int i = 0; i < t; i++) {
                String pair = pair_left[i] + " " + pair_right[i];
                if(!set.contains(pair)){
                    count++;
                    set.add(pair);
                }
                System.out.println(count);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
