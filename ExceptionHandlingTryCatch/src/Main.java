import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\ExceptionHandlingTryCatch\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {


            try {
                int a = Integer.parseInt(in.nextLine());
                int b = Integer.parseInt(in.nextLine());

                System.out.println(a / b);

            } catch (NumberFormatException e) {
                System.out.println("java.util.InputMismatchException");
            } catch (ArithmeticException a){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
