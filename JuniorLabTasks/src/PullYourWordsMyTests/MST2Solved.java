package PullYourWordsMyTests;

public class MST2Solved {
    public static void main(String[] args) {
        String[] example01 = {"i'm","afraid","I","can't","let","you","do","that"};
        String[] example10 = {"yes"};

        System.out.println(sentencify(example01));
        System.out.println(sentencify(example10));

    }

    static String sentencify(String[] words){
        //your code here
        StringBuilder sb = new StringBuilder();
        //заполняем словами и разделяем пробелами
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i] + " ");
            //если это слово последнее
            if (i == words.length - 1) {
                //убираем последний символ(пробел)
                sb.delete(sb.length()-1,sb.length());
                //и добавляем точку
                sb.append(".");
            }
        }
        //Вырезать первый символ и заглавить --> I Y
        String s0 = sb.substring(0, 1).toUpperCase();
        //Вырезать все остальное
        String s1 = sb.substring(1, sb.length());
        return s0 + s1;
    }
}
