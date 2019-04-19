package RgbToHex;

//import static javafx.scene.paint.Color.rgb;

public class Rgb {
    public static void main(String[] args) {
        System.out.println(rgb(148, 0, 211));
    }

    public static String rgb(int r, int g, int b) {
        return (conversOfNum(r) + conversOfNum(g) + conversOfNum(b)).toUpperCase();
    }

    public static String conversOfNum(int n) {
        StringBuilder sb = new StringBuilder();
        if (n > 255) n = 255;
        if (n < 0) n = 0;

        if (Integer.toHexString(n).length()==1)
            sb.append("0"+Integer.toHexString(n));
        else
            sb.append(Integer.toHexString(n));
        return sb.toString();
    }
}

//0-255