import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;

//Scanner in = new Scanner(System.in);


class Solution{

    public static void main(String []args) throws FileNotFoundException {

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\ICS_HackerRank\\src\\input00.txt";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
