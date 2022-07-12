package com.example.feedme;

// Java programs for ArrayList and Getting Random Elements
import java.util.ArrayList;
import java.util.Random;

public class feedme {
    public static void main(String[] args)
    {
        // creating ArrayList
        ArrayList<String> Dinner = new ArrayList<String>();

        // adding elements
        Dinner.add("American");
        Dinner.add("Asian");
        Dinner.add("Breakfast");
        Dinner.add("Italian");
        Dinner.add("Mexican");

        //Randomizing to print output
        Random r = new Random();
        {
            int randomitem = r.nextInt(Dinner.size());
            String randomElement = Dinner.get(randomitem);
            System.out.println("Random Element = " + randomElement);
        }
    }
}