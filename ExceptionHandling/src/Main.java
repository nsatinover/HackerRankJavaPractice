import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();
class MyCalculator {
    public static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }
        else {
            return (int) Math.pow(n, p);
        }
    }
}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\ExceptionHandling\\src\\input\\input00.txt";
        File input = new File(filePath);

        MyCalculator my_calculator = new MyCalculator();
        try (Scanner in = new Scanner(input)) {
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
