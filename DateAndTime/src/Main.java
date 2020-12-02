import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
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

        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\DateAndTime\\src\\input\\input00.txt";
        File input = new File(filePath);

        try (Scanner in = new Scanner(input)) {

            String month = in.next();
            String day = in.next();
            String year = in.next();

            String output = findDay(month, day, year);
            System.out.println(output);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    } //main

    private static String findDay(String month, String day, String year) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        calendar.setTime(date);

        SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE");
        return dayOfWeek.format(date).toUpperCase();
    }
} //Solution
