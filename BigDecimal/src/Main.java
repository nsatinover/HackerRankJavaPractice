import java.math.BigDecimal;
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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\BigDecimal\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner sc = new Scanner(input)) {

            //Input
            //Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();

            //region Write your code here
//            String []x = new String[s.length - 2];
//            int count = 0;
//            for (int i = 0; i < x.length; i++) {
//                if(s[i] != null && s[i].length() > 0){
//                    x[count] = s[i];
//                    count++;
//                }
//            }
//
//            s = x;
            s = Arrays.copyOf(s, n);

            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    BigDecimal a = new BigDecimal(o1);
                    BigDecimal b = new BigDecimal(o2);
                    return a.compareTo(b);
                }
            };

            Arrays.sort(s, Collections.reverseOrder(comparator));

//            for (int i = 0; i < s.length; i++) {
//                for (int j = 0; j < s.length; j++) {
//
//                    BigDecimal iBig = new BigDecimal(s[i]);
//                    BigDecimal jBig = new BigDecimal(s[j]);
//
//                    if (iBig.compareTo(jBig) == 1){
//                        String temp = s[i];
//                        s[i] = s[j];
//                        s[j] = temp;
//                    }
//
//                }
//            }
            //endregion

            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
