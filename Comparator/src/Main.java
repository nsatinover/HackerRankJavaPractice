import java.util.*;
import java.io.*;
import java.util.Scanner;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        Integer ret;

        Integer o1_Score = o1.score;
        Integer o2_Score = o2.score;
        ret = o2_Score.compareTo(o1_Score);

        if (ret == 0){
            String o1_Name = o1.name;
            String o2_Name = o2.name;
            ret = o1_Name.compareTo(o2_Name);
            return ret;
        }

        return ret;
    }
}

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\Comparator\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner scan = new Scanner(input)) {
            //Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            Player[] player = new Player[n];
            Checker checker = new Checker();

            for(int i = 0; i < n; i++){
                player[i] = new Player(scan.next(), scan.nextInt());
            }
            scan.close();

            Arrays.sort(player, checker);
            for(int i = 0; i < player.length; i++){
                System.out.printf("%s %s\n", player[i].name, player[i].score);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
