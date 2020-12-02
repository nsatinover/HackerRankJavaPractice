import java.util.*;
import java.io.*;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){

        JavaLoopNested javaLoopNested = new JavaLoopNested();
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\JavaLoops2\\src\\input\\input00.txt";
        File input = new File(filePath);
        try (Scanner in = new Scanner(input)) {

            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

/*                System.out.print(a + " " + b + " " + n);
                System.out.println();*/
                javaLoopNested.output(a, b, n);

            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
