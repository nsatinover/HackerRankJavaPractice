import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;

//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src
//Scanner in = new Scanner(System.in);


class Solution{
    private static Scanner in;

    public static void main(String []args) throws FileNotFoundException {

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\PrimalityTest\\src\\input00.txt";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        File input = new File(filePath);

        try (Scanner scanner = new Scanner(input)) {
            String n = scanner.nextLine();

            BigInteger big = new BigInteger(n);

            boolean isPrime = big.isProbablePrime(10);
            if (isPrime){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
