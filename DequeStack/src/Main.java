import javafx.beans.binding.When;

import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();

class Parser{
    public boolean isBalanced(String s){
        List<String> list = Arrays.asList(s.split(""));
        boolean isBal = true;

        if(list.size() % 2 == 1){
            return false;
        }

        ArrayDeque<String> deque = new ArrayDeque<>();
        for (String listStr: list) {
            deque.add(listStr);
        }

        int count = deque.size() / 2;
        for (int i = 0; i < count; i++) {
            if (deque.getFirst().equals("{")){
                isBal = deque.removeFirstOccurrence("}");
                if (isBal == true) {
                    deque.removeFirst();
                }
                else{
                    return false;
                }
            }
            else if (deque.getFirst().equals("(")){
                isBal = deque.removeFirstOccurrence(")");
                if (isBal == true) {
                    deque.removeFirst();
                }
                else{
                    return false;
                }
            }
            else {
                return false;
            }
        }

//        for (String str: deque) {
//            System.out.println(str);
//        }
        return true;
    }
}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\DequeStack\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            Parser parser = new Parser();

            while (in.hasNext()){
//                parser.isBalanced(in.next());
                System.out.println(parser.isBalanced(in.next()));
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
