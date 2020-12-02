import jdk.nashorn.internal.codegen.types.BitwiseType;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\BitSet\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            //Scanner in = new Scanner(System.in);
            int length = in.nextInt();
            int numOfQueries = in.nextInt();

            BitSet bitSet1 = new BitSet(length);
            BitSet bitSet2 = new BitSet(length);

            for (int i = 0; i < length; i++) {
                bitSet1.set(i, false);
                bitSet2.set(i, false);
            }

            for (int i = 0; i < numOfQueries; i++) {
                String s = in.next();
                int setNum = in.nextInt();
                int index = in.nextInt();

                switch (s){
                    case "AND":
                        if (setNum == 1){
                            bitSet1.and(bitSet2);
                        }
                        else {
                            bitSet2.and(bitSet1);
                        }
                        break;
                    case "SET":
                        if (setNum == 1){
                            bitSet1.set(index);
                        }
                        else {
                            bitSet2.set(index);
                        }
                        break;
                    case "FLIP":
                        if (setNum == 1){
                            bitSet1.flip(index);
                        }
                        else {
                            bitSet2.flip(index);
                        }
                        break;
                    case "OR":
                        if (setNum == 1){
                            bitSet1.or(bitSet2);
                        }
                        else {
                            bitSet2.or(bitSet1);
                        }
                        break;
                    case "XOR":
                        if (setNum == 1){
                            bitSet1.xor(bitSet2);;
                        }
                        else {
                            bitSet2.xor(bitSet1);
                        }
                        break;
                }


                System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
