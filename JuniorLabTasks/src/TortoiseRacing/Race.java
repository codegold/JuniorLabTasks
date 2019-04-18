package TortoiseRacing;

public class Race {

    public static int[] race(int v1, int v2, int g) {
        int hours, minutes, seconds;
        if (v1 >= v2) return null;
        else {
            double time = 3600 * g / (double) (v2 - v1);
            hours = (int) (time / 3600);
            minutes = (int) ((time - hours * 3600) / 60);
            seconds = (int) ((time - hours * 3600) - minutes * 60);
        }
        return new int[]{hours, minutes, seconds};
    }

    public static void main(String[] args) {
        showArray(race(720, 850, 70));
        System.out.println();
        showArray(race(80, 91, 37));
    }

    public static void showArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int j = 0; j < array.length; j++) {
            sb.append(array[j]);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        System.out.println(sb.toString());
    }
}

