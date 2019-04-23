package RectangleIntoSquares;

import java.util.ArrayList;
import java.util.Arrays;

public class LabWork2 {
    public static int[] sqInRect(int lng, int wdth) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (lng == wdth) return null;
        else {
            do {
                if (lng > wdth) {
                    lng -= wdth;
                    arrayList.add(wdth);
                } else {
                    wdth -= lng;
                    arrayList.add(lng);
                }
            } while (lng != wdth);
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println();
        int example01 = 6;
        int example02 = 6;
        int example11 = 5;
        int example12 = 5;
        int example21 = 5;
        int example22 = 3;
        int example31 = 3;
        int example32 = 5;
        int example41 = 20;
        int example42 = 14;
        int example51 = 240;
        int example52 = 32;
        int example61 = 135;
        int example62 = 85;

        System.out.println(Arrays.toString(sqInRect(example01, example02))); // null
        System.out.println(Arrays.toString(sqInRect(example11, example12))); // null
        System.out.println(Arrays.toString(sqInRect(example21, example22))); // {3, 2, 1, 1}
        System.out.println(Arrays.toString(sqInRect(example31, example32))); // {3, 2, 1, 1}
        System.out.println(Arrays.toString(sqInRect(example41, example42))); // {14, 6, 6, 2, 2, 2}
        System.out.println(Arrays.toString(sqInRect(example51, example52))); // {32, 32, 32, 32, 32, 32, 32, 16, 16}
        System.out.println(Arrays.toString(sqInRect(example61, example62))); // {85, 50, 35, 15, 15, 5, 5, 5}
    }
}
