import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Method;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();
class Printer
{
    //Write your code here
    static <T> void printArray(T[] a) {
        for (T o : a) {
            System.out.println(o);
        }
    }

}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Generics\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            Printer myPrinter = new Printer();
            Integer[] intArray = { 1, 2, 3 };
            String[] stringArray = {"Hello", "World"};
            myPrinter.printArray(intArray);
            myPrinter.printArray(stringArray);
            int count = 0;

            for (Method method : Printer.class.getDeclaredMethods()) {
                String name = method.getName();

                if(name.equals("printArray"))
                    count++;
            }

            if(count > 1)System.out.println("Method overloading is not allowed!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
