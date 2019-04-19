package SimplePigLatin;

public class Transfer {


    public static String pigIt(String str) {

        String specialStr = "ay";
        String[] words = str.split(" ");
        String pigStr = "";
        for (int i = 0; i < words.length; i++) { //Make all vars from 2nd symbol
            String currentWord = words[i];
            //Каждое слово в массиве со второго симовла
            String newString = currentWord.substring(1);


            newString += currentWord.substring(0, 1) + specialStr;

            pigStr += newString + " ";
        }
        pigStr = pigStr.substring(0, pigStr.length()-1);

        return pigStr;
    }
//
//    public static String testX(String str) {
//        String special = "ay";
//        String[] words = str.split(" ");
//        String pigString = "";
//        for (int i = 0; i < words.length; i++) {
//            String currentW = words[i];
//            String newSt = currentW.substring(1); // ig atin s ool
//            newSt += currentW.substring(0,1) + special;
//
//            pigString += newSt += " ";
//        }
//        return pigString;
//    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
        //System.out.println(testX("Pig latin is cool"));
    }
}

