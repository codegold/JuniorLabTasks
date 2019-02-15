package RectangleIntoSquares;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Рисунок ниже показывает, как можно разрезать прямоугольник на квадраты:
 * Нужно придумать из этого рисунка алгоритм.
 * <p>
 * Вам даны две величины:
 * <p>
 * Длина прямоугольника (параметр lng)
 * Ширина прямоугольника (параметр width)
 * Вы должны вернуть массив чисел с размером стороны каждого квадрата.
 * <p>
 * Если передаваемые аргументы равны, то вернуть null.
 */

public class MSS {
    public static void main(String[] args) {
        printArray(sqInRect(6, 6));
        printArray(sqInRect(5, 5));
        printArray(sqInRect(3, 5));
        printArray(sqInRect(5, 3));
        printArray(sqInRect(20, 14));
        printArray(sqInRect(240, 32));
        printArray(sqInRect(135, 85));
    }


    public static void printArray(int[] arr) {
        try {
            for (int i : arr) {
                System.out.println(i + " ");
            }
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("null");
        }
    }

    public static int[] sqInRect(int lng, int wdth) {
        ArrayList<Integer> integers = new ArrayList<>();
        if (lng != wdth) {
            while (lng > 0 && wdth > 0) {
                if (lng > wdth) {
                    integers.add(wdth);
                    lng -= wdth;
                }else {
                    if(lng < wdth) {
                        integers.add(lng);
                        wdth -= lng;
                    }else{
                        integers.add(wdth);
                        break;
                    }
                }
            }
        } else return null;

        int i = 0;
        int[]arr = new int[integers.size()];
        for(Integer integer : integers) {
            arr[i++] = integer;
        }
        return arr;
    }
}
