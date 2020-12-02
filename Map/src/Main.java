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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Map\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            //get first line integer n
            int numOfEntries = in.nextInt();
            in.nextLine();
            //get first int in line
            HashMap<String, Integer> hashMap = new HashMap<>();

            //get array of ints
            for (int i = 0; i < numOfEntries; i++) {
                String name = in.nextLine();
                int number = in.nextInt();
                in.nextLine();

                hashMap.put(name,number);
            }
            //get queries
            String query = in.nextLine();
            while (query != null && query.length() > 0){
                if(hashMap.containsKey(query)){
                    System.out.println(query + "=" + hashMap.get(query).toString());
                }
                else {
                    System.out.println("Not found");
                }

                if(in.hasNext()){
                    query = in.nextLine();
                }
                else {
                    break;
                    //query = null;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
