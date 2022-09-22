package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "HLEZJZ";
        }
        if (query.toLowerCase().contains("spaghetti")){
            return "I like to eat spaghetti and meatballs";
        }
        if(query.toLowerCase().contains("eiffel tower")){
            return "Paris";
        }
        if(query.toLowerCase().contains("james bond")){
            return "Sean Connery";
        }
        // if (query.toLowerCase().contains("largest")){
        //     // Pattern regex = Pattern.compile("Which of the following numbers is the largest: \\w+");
        //     // Matcher matcher = regex.matcher(query);

        //     int max = 0;
        //     String[] parts = matcher.group(1).split(", ");
        //     for(int i = 0; i < parts.length; i++){
        //         try{
        //             int num = Integer.parseInt(parts[i]);
        //             if(num > max) max = num;
        //         } catch (NumberFormatException nfe){
        //         }
                
        //     }
        //     return "" + max;
        // }
        if(query.toLowerCase().contains("plus")){
            int sum = 0;
            String[] parts = query.split(" ");
            for(int i = 0; i < parts.length; i++){
                try{
                    int num = Integer.parseInt(parts[i]);
                    sum += num;
                } catch (NumberFormatException nfe){
                }
                
            }
            return "" + sum;
        }
        if(query.toLowerCase().contains("multiplied")){
            int sum = 1;
            String[] parts = query.split(" ");
            for(int i = 0; i < parts.length; i++){
                try{
                    int num = Integer.parseInt(parts[i]);
                    sum *= num;
                } catch (NumberFormatException nfe){
                }
                
            }
            return "" + sum;
        }
        return "";
    }
}
