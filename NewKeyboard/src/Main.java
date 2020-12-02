import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();
class Result {

    public static String receivedText(String S) {

        List<String> list = new ArrayList<>(Arrays.asList(S.split("")));
        StringBuilder builder = new StringBuilder();
        Pattern numeric = Pattern.compile("[0-9]");

        boolean isNumLock = true;
        int index = 0;


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if(s.equals("*")){
                if(index != 0){
                    builder.deleteCharAt(index - 1);
                    index--;
                }
            }
            else if(s.equals("<")){
                index = 0;
            }
            else if(s.equals(">")){
                index = builder.length();
            }
            else if(s.equals("#")){
                isNumLock = isNumLock == true ? false : true;
            }
            else if(s.matches(String.valueOf(numeric))){ //s.matches("[0-9]"
                if (isNumLock){
                    builder.insert(index, s);
                    index++;
                }
            }
            else {
                builder.insert(index, s);
                index++;
            }
        }
        return String.valueOf(builder);
    }

}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\NewKeyboard\\src\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            //get in the input as a string
            String str = in.next();

            //print output
            System.out.println(Result.receivedText(str));

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
