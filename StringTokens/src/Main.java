import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;

//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src
//Scanner in = new Scanner(System.in);


class Solution{
    private static Scanner in;

    public static void main(String []args) throws FileNotFoundException {

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\StringTokens\\src\\input00.txt";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        File input = new File(filePath);

        try (Scanner scan = new Scanner(input)) {

            int arrSize = 0;
            List<String> arr = null;

            if (scan.hasNext()){
                String s = scan.nextLine();

                s = s.trim();
                arr = Arrays.asList(s.split("[!,?._'@\\s]+"));
                if(arr != null && arr.size() > 0){
                    arrSize = arr.size();
                }
            }

            System.out.println(arrSize);
            if(arr != null){
                for (String str: arr) {
                    System.out.println(str);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
