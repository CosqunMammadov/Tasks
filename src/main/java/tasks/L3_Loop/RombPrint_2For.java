package tasks.L3_Loop;

public class RombPrint_2For {
    public static void main(String[] args) {
        int userInput = 8;
        int amountOfRows = userInput * 2 - 1;
        int amountOfColumn = userInput * 2 - 2;
        int a = userInput - 1;
        int b = userInput - 1;


        for (int row = 0; row <= amountOfRows + 1; row++) {
            for (int column = 0; column <= amountOfColumn; column++) {
                if (row == userInput)
                    break;

                if (row % 2 == 0 && column % 2 == 0 && column <= a && column >= b)
                    System.out.print("*");
                else if (row % 2 != 0 && column % 2 != 0 && column <= a + 1 && column >= b - 1)
                    System.out.print("*");
                else System.out.print(" ");

            }
            if (row >= userInput + 1 && row % 2 == 0) {
                a -= 2;
                b += 2;
            } else if (row < userInput - 1 && row % 2 != 0) {
                a += 2;
                b -= 2;
            }
            if (row != userInput)
                System.out.println();
        }


        // 0123456789123
        //       *         0
        //      * *        1
        //     * * *       2
        //    * * * *      3
        //   * * * * *     4
        //  * * * * * *    5
        // * * * * * * *   6
        // 0123456789123
    }
}
