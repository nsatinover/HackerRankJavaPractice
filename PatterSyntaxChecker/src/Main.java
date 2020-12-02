import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\PatterSyntaxChecker\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0) {
                String pattern = in.nextLine();

                try {
                    Pattern isPattern = Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (PatternSyntaxException exception) {
                    System.out.println("Invalid");
                }

                testCases--;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
