import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b){
        //set string to lowerCase
        a = a.toLowerCase();
        b = b.toLowerCase();

        //place into char Arrays
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        //return false if length differs
        if (charA.length != charB.length){
            return false;
        }
        else {
            //sort alphabetical
            for (int i = 0; i < charA.length; i++) {
                for (int j = 0; j < charA.length; j++) {
                    if (charA[i] < charA[j]){
                        swapChars(charA, i, j);
                    }
                    if(charB[i] < charB[j]){
                        swapChars(charB, i, j);
                    }
                }
            }

            for (int i = 0; i < charA.length; i++) {
                if(charA[i] != charB[i]){
                    return false;
                }
            }
        }

        return true;
    }

    static void swapChars(char[] charA, int i, int j) {
        char temp = charA[i];
        charA[i] = charA[j];
        charA[j] = temp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
