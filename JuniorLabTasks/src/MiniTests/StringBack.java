package MiniTests;

public class StringBack {
    public static void main(String[] args) {
        String myString = "java";
        System.out.println(reverseString(myString));


    }

    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }
}