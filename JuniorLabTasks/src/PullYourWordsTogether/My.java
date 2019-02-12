package PullYourWordsTogether;

import java.util.StringJoiner;
import java.lang.String;
import java.lang.StringBuilder;



public class My {
    public static void main(String[] args) {

        String[] arr = new String[]{"i", "am", "super", "HERO"};
        StringJoiner sj = new StringJoiner(" ");
        // Capitalize first word
        sj.add(capitalize(arr[0]));
        // Add the remaining words
        for (int i = 1; i <arr.length; i++) {
            sj.add(arr[i]);
        }
//        for (String s : arr) {
//            sj.add(s);
//        }
        String result = sj.toString() + ".";
        System.out.println(result);


    }



    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

//    public String firstUpperCase(String array) {
//        if (array == null || array.isEmpty()) return " ";
//        return array.substring(0, 1).toUpperCase() + array.substring(1);
    //  }


}
