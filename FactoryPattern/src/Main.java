import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.security.*;

//System.out.print();
//System.out.println();
//C:\Users\nsati_000\IdeaProjects\HackerRank\Template\src

//Scanner in = new Scanner(System.in);
//in.next();
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {

//Write your code here
        return order.equals("cake") ? new Cake() : new Pizza();
//        Food food;
//        if (order.equals("cake")){
//            food = new Cake();
//        }
//        else{
//            food = new Pizza();
//        }
//        return food;
    }//End of getFood method

}//End of factory class

class Solution{
    private static Scanner in;

    public static void main(String []args){

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\FactoryPattern\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner sc = new Scanner(input)) {

            Do_Not_Terminate.forbidExit();

            try{
                //Scanner sc=new Scanner(System.in);
                //creating the factory
                FoodFactory foodFactory = new FoodFactory();

                //factory instantiates an object
                Food food = foodFactory.getFood(sc.nextLine());


                System.out.println("The factory returned "+food.getClass());
                System.out.println(food.getType());
            }
            catch (Do_Not_Terminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main
} //Solution
