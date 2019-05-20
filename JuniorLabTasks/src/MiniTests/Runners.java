package MiniTests;

import java.io.IOException;

public class Runners {

    public static void main(String[] args) throws IOException {
        String[] names = {"Elena", "Thomas", "Hamilton",
                "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
                "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
                "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243,
                334, 412, 393, 299, 343, 317, 265};

        int firstRun = firstRunner(times);
        int secondRun = secondRunner(times);
        //int second = second(times);
        System.out.println(names[firstRun] + " was first!");
        System.out.println(secondRunner(times));
        System.out.println(secondRunner2(times));
    }

    private static int firstRunner(int[] times) {
        int num = times[0];
        int person = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < num) {
                num = times[i];
                person = i;
            }
        }
        return person;
    }

    private static int secondRunner(int[] times) {
        //int num = times[0];

        int firstLow = Integer.MAX_VALUE;
        int secondLow = Integer.MAX_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < firstLow) {
                secondLow = firstLow;
                firstLow = times[i];
            } else if (times[i] < secondLow)
                secondLow = times[i];
        }
        return secondLow;
    }

    private static int secondRunner2(int[] times) {
        int first = times[times.length-1];
        int second = times[times.length-1];

        for (int i = 0; i < times.length; i++) {
            if (times[i] < first) {
                second = first;
                first = times[i];
            } else if (times[i] < second) {
                second = times[i];
            }
        } return second;

    }
}

//Test hotkey