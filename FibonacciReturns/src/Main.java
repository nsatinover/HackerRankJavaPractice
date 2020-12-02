import java.math.BigInteger;
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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\FibonacciReturns\\src\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            //get Fibonacci iteration
            while (in.hasNext()){
                BigInteger x = in.nextBigInteger();
                
                Map<BigInteger, BigInteger> map = new HashMap<>();

                //if already solved for, print value
                if(map.containsKey(x)){
                    System.out.println(map.get(x));
                }
                else {
                    BigInteger n1 = BigInteger.ZERO;
                    BigInteger n2 = BigInteger.ONE;
                    //set n3 equal to input to deal with 0 or 1 as input
                    BigInteger n3 = x;

                    //set i = 2 as Fibonacci begins with 0 + 1
                    for (long i = 2; i <= x.longValue(); i++) {
                        n3 = n1.add(n2);
                        n1 = n2;
                        n2 = n3;
                    }

                    map.put(x, n3);
                    System.out.println(n3);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
