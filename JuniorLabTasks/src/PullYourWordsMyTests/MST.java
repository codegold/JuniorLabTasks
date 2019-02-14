package PullYourWordsMyTests;

import java.lang.String;
import java.lang.StringBuilder;


public class MST {
    public static String sentencify(String[] words) {
        //Метод toCharArray() преваращаем из строки массив чаров
        char[] charArray = words[0].toCharArray();
        for (int i = 0; i < 1; i++) {
            charArray[i] = Character.toUpperCase(charArray[i]);
        }

        String firstWord = new String();

        //Зполняем циклом переменную firstWord символами charArray
        for (int i = 0; i < firstWord.length(); i++) {
            firstWord += charArray[i];
        }

//        StringBuilder sb = new StringBuilder();
//        String s0 = sb.substring(0, 1).toUpperCase();
//        String s1 = sb.substring(1, sb.length());
//
//        return s0 + s1;

        /** Здесь теряется первое слово*/
        //words[0] = firstWord.substring(0, firstWord.length()); //в скобках аргументы начало и конец

        String result = new String();

        for (String word : words) {
            result = result + word + " "; //В переменную резалт складываем слова через пробел
        }
        result = result + ".";
        return result.replace(" .", "."); //Убираю лишний пробел перед точкой
    }


    public static void main(String[] args) {
        String[] example01 = {"yes"};
        String[] example11 = {"i", "am", "an", "AI"};
        String[] example21 = {"Eqsjljvg", "qzmvvnsftq", "vfvtcztccd", "qoxmkdlj", "trbnkd", "runo", "usxjjzc", "ojwwic", "lqwegnro", "lhatj"};
        String[] example31 = {"Cnqumyzpl", "nagmknl", "amjrarohf", "tledyoxc", "czluzczscl", "gdhkkj", "muqhareo", "zwxypbx", "ntmshksfe", "qqebzsouj"};
        String[] example41 = {"let", "there", "be", "light"};
        String[] example51 = {"i'm", "afraid", "I", "can't", "let", "you", "do", "that"};
        String[] example61 = {"FIELDS", "of", "CORN", "are", "to", "be", "sown"};

        System.out.println(sentencify(example01));
        System.out.println(sentencify(example11));
        System.out.println(sentencify(example21));
        System.out.println(sentencify(example31));
        System.out.println(sentencify(example41));
        System.out.println(sentencify(example51));
        System.out.println(sentencify(example61));
    }

    public static String capitalize(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
