package PullYourWordsMyTests;

import java.util.Scanner;
import java.util.StringJoiner;
import java.lang.String;
import java.lang.StringBuilder;

public class MyTest {

    public static String sentencify(String[] words) {
        Scanner scanner = new Scanner(System.in).useDelimiter(" ");
        StringJoiner sj = new StringJoiner(" ");
        // Capitalize first word
        sj.add(capitalize(words[0]));
        // Add the remaining words
        for (int i = 1; i < words.length; i++) {
            sj.add(words[i]);
        }
        return null;

    }

    public static void main(String[] args) {

        String[] words = new String[]{"i", "am", "super", "HERO"};



        String result = words.toString() + ".";
        System.out.println(result);


    }


    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

}


