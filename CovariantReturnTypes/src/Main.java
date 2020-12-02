import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    public String whatsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Flower yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Flower yourNationalFlower(){
        return new Lily();
    }
}


class Solution {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\nsati_000\\IdeaProjects\\HackerRank\\CovariantReturnTypes\\src\\input00.txt";
        File input = new File(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

