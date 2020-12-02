import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src
//Scanner in = new Scanner(System.in);
class Add {
    public static void add(int...varArgInts){
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < varArgInts.length; i++) {
            int x = varArgInts[i];
            sum += x;
            builder.append(x + "+");
        }
        builder.replace(builder.lastIndexOf("+"), builder.lastIndexOf("+") + 1, "=");
        builder.append(sum);
        System.out.println(builder);
    }
}

class Solution{
    private static Scanner in;

    public static void main(String []args) throws FileNotFoundException {

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\SimpleAdditionVarArgs\\src\\input00.txt";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {
            try{

                int n1=Integer.parseInt(br.readLine());
                int n2=Integer.parseInt(br.readLine());
                int n3=Integer.parseInt(br.readLine());
                int n4=Integer.parseInt(br.readLine());
                int n5=Integer.parseInt(br.readLine());
                int n6=Integer.parseInt(br.readLine());
                Add ob=new Add();
                ob.add(n1,n2);
                ob.add(n1,n2,n3);
                ob.add(n1,n2,n3,n4,n5);
                ob.add(n1,n2,n3,n4,n5,n6);
                Method[] methods=Add.class.getDeclaredMethods();
                Set<String> set=new HashSet<>();
                boolean overload=false;
                for(int i=0;i<methods.length;i++)
                {
                    if(set.contains(methods[i].getName()))
                    {
                        overload=true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if(overload)
                {
                    throw new Exception("Overloading not allowed");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
