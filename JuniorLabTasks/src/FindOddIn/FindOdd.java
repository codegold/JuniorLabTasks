package FindOddIn;

public class FindOdd {
    public static int findOdd(int[] arr) {
        int rep = 0;
        for (int num : arr) {
            rep ^= num;
        } return rep;
    }


    public static void main(String[] args) {
        int[] arr = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findOdd(arr));
        int x = 342;
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(343 | 342);
    }
}
