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

        int firstRun = first_runner(times);
        int secondRun = second_runner(times);
        //int second = second(times);
        System.out.println(names[firstRun] + " was first!");
        System.out.println(secondResult(times));
    }

    private static int first_runner(int[] times) {
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

    private static int second_runner(int[] times) {
        int num = times[0];
        int person = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (times[i] > first) {
                second = first;

                first = times[i];
            } else if (times[i] > second)
                second = times[i];
        }
        person = second;
        return person;

    }

    private static int secondResult(int[] times) {
        int firstBest = 0, secondBest = 0;
        for (int x : times) {
            if (x > firstBest) {
                secondBest = firstBest;
                firstBest = x;
            } else if (x > secondBest) {
                secondBest = x;
            }
        }
        return secondBest;
    }
}

