import java.io.File;
import java.io.*;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        HandleBigInteger handleBigInteger = new HandleBigInteger();
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\BigInteger\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            // Convert the string input to BigInteger
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());

//            System.out.println(a);
//            System.out.println(b);

            HandleBigInteger.addAndMultiply(a, b);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
