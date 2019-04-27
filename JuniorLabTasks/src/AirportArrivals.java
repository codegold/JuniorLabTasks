import java.util.Arrays;
import java.util.stream.Stream;

public class AirportArrivals {
    public static String[] flapDisplay(String[] lines, int[][] rotors) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
        char[] linesToArray = lines[0].toCharArray();
        int startPos, finishPos;
        for (int i = 0; i < lines[0].length(); i++) {
            for (int j = i; j < lines[0].length(); j++) {
                char letter = lines[0].charAt(j);
                startPos = symbols.indexOf(letter);
                finishPos = startPos + rotors[0][i];
                finishPos = finishPos % 54;
                //int cond = symbols.length() - finishPos;
                char newLetter = symbols.charAt(finishPos);
                linesToArray[j] = newLetter;
            }
            lines[0] = new String(linesToArray);
        }
//       System.out.println(linesToArray);
//        System.out.println("-----------");
        return lines;
    }


    public static void main(String[] args) {
        String[] example01 = {"IN SPACE NOBODY...  "};
        int[][] example02 = {{48, 47, 0, 21, 38, 120, 48, 15, 41, 11, 43, 19, 47, 3, 17, 2, 41, 50, 23, 16}};
        String[] example11 = {"CAT"};
        int[][] example12 = {{1, 13, 27}};
        String[] example21 = {"HELLO "};
        int[][] example22 = {{15, 49, 50, 48, 43, 13}};
        String[] example31 = {"CODE"};
        int[][] example32 = {{20, 20, 28, 0}};
        String[] example41 = {"NOTHING MOVED"};
        int[][] example42 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        String[] example51 = {"EFGH"};
        int[][] example52 = {{53, 53, 53, 53}};

        System.out.println(Arrays.toString(flapDisplay(example01, example02)));
        System.out.println(Arrays.toString(flapDisplay(example11, example12)));
        System.out.println(Arrays.toString(flapDisplay(example21, example22)));
        System.out.println(Arrays.toString(flapDisplay(example31, example32)));
        System.out.println(Arrays.toString(flapDisplay(example41, example42)));
        System.out.println(Arrays.toString(flapDisplay(example51, example52)));
    }
}

//