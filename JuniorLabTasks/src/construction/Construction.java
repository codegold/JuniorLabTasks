package construction;
/*
Входной аргумент n указывает количество этажей в пентхаусе.
Постройте дом следующим образом:
        ___
       /___\
      /_____\
      |  _  |  // 1 floor
      |_|_|_|

       _____
      /_____\
     /_______\
    /_________\
   /___________\
   |           |
   |    ___    |  // 2 floors
   |   |   |   |
   |___|___|___|

      _______
     /_______\
    /_________\
   /___________\
  /_____________\
 /_______________\
/_________________\
|                 |      // 3 floors
|                 |
|      _____      |
|     |     |     |
|     |     |     |
|_____|_____|_____|
*/

public class Construction {
    public static String myCrib(int n) {

        return drawHouse(n);
    }

    public static String drawHouse(int n) {
        StringBuilder sb = new StringBuilder();
        int roof = 2 * n + 1;
        int commonWidth = n * 6 + 1;
        int center = (commonWidth % 2 == 0) ? commonWidth / 2 + 1 : commonWidth / 2;
        int c = center - roof / 2;

        //отступ
        for(int i = 0; i < c; i++) {
            sb.append(" ");



        }return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(drawHouse(14));
        System.out.println(drawHouse(1));
        System.out.println(drawHouse(3));
        System.out.println(drawHouse(26));
    }
}