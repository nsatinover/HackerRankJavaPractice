import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    private static Scanner scan;

    abstract class Calculator {
        abstract int add(int a, int b);
    }

    class Adder extends Calculator {
        public int add(int a, int b){
            return a+b;
        }

    }


    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Assessment\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner scan = new Scanner(input)) {
            int a, b;
                a = scan.nextInt();
                b = scan.nextInt();

            Calculator adderObject = new Adder();
            System.out.println("The sum is: " + adderObject.add(a, b));
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
