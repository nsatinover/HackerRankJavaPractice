import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;

//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src
//Scanner in = new Scanner(System.in);
class Singleton {

    public String str;
    private static Singleton singleton = null;

    private Singleton(){ }

    public static Singleton getSingleInstance() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}

class Solution{
    private static Scanner in;

    public static void main(String []args) throws FileNotFoundException {

//        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Template\\src\\input00.txt";
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
//        File input = new File(filePath);
//
//        try (Scanner in = new Scanner(input)) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }



    } //main
} //Solution
