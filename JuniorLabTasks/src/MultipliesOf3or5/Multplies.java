package MultipliesOf3or5;

public class Multplies {

    public static int solution(int number) {
        int sum = 0;
        if (number < 4) {
            return 0;
        } else {
            for (int i = number - 1; i > 0; i--) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }
        return sum;

    }


    public static void main(String[] args) {
        int example01 = 3;
        int example02 = 50;
        int example03 = 33;

        System.out.println(solution(example01));
        System.out.println(solution(example02));
        System.out.println(solution(example03));

    }
}