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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\FibonacciLite\\src\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            //get Fibonacci iteration
            int x = in.nextInt();

            int n1 = 0;
            int n2 = 1;
            //set n3 equal to input to deal with 0 or 1 as input
            int n3 = x;
            //set i = 2 as Fibonacci begins with 0 + 1
            for (int i = 2; i <= x; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(n3);

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
